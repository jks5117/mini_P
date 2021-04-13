package athread.talk2;

import java.util.StringTokenizer;
import java.util.Vector;

/****************************
 * 이벤트 핸들러의 역할은 말하기이고
 * 클라이언트측의 스레드 역할은 듣기이다.
 * 
 * 
 ******************************/

public class TomatoClientThread extends Thread {
	TomatoClient tc = null;
	public TomatoClientThread(TomatoClient tc) {
		this.tc = tc;
	}
	@Override
	public void run() {
		boolean isStop = false;
		while(!isStop) {
			try {
				String msg = "";//100#apple
				msg = (String)tc.ois.readObject();
				StringTokenizer st = null;
				int protocol = 0;//100|200|201|202|500
				if(msg !=null) {
					st = new StringTokenizer(msg,"#");
					protocol = Integer.parseInt(st.nextToken());//100
				}
				switch(protocol) {
					case 100:{//100#apple
						String nickName = st.nextToken();
						tc.jta_display.append(nickName+"님이 입장하였습니다.\n");
						Vector<String> v = new Vector<>();
						v.add(nickName);
						tc.dtm.addRow(v);
					}break;
					case 200:{
						
					}break;
					case 201:{
						String nickName = st.nextToken();
						String message = st.nextToken();
						tc.jta_display.append("["+nickName+"]"+message+"\n");
						tc.jta_display.setCaretPosition
						(tc.jta_display.getDocument().getLength());					
					}break;
					case 202:{
				
					}break;
					case 500:{
						String nickName = st.nextToken();
						tc.jta_display.append(nickName+"님이 퇴장 하였습니다.\n");
						tc.jta_display.setCaretPosition
						(tc.jta_display.getDocument().getLength());
						for(int i=0;i<tc.dtm.getRowCount();i++) {
							String n =(String)tc.dtm.getValueAt(i, 0);
							if(n.equals(nickName)) {
								tc.dtm.removeRow(i);
							}
						}
					}break;
				}////////////end of switch
			} catch (Exception e) {
				// TODO: handle exception
			}
		}////////////////////end of while
		
	}
}