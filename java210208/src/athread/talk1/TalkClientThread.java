package athread.talk1;

import java.util.StringTokenizer;

public class TalkClientThread extends Thread {
	TalkClient tc = null;

	public TalkClientThread(TalkClient talkClient) {
		this.tc = talkClient;//조립이다. 연결
	}
	@Override
	public void run() {//여기는 듣는 곳이다.
		System.out.println("run호출 성공");
		boolean isStop = false;
		while(!isStop) {
			try {
				String msg = "";
				msg = (String)tc.ois.readObject();
				StringTokenizer st = null;
				int protocol = 0;
				if(msg!=null) {
					st = new StringTokenizer(msg,"#");
					protocol = Integer.parseInt(st.nextToken());
				}
				switch(protocol) {
					case 100:{
						String nickName = st.nextToken();
						tc.jta_display.append(nickName+"님이 입장하였습니다.\n");
					};
					case 200:{
						String nickName = st.nextToken();
						String msg2 = st.nextToken();
						tc.jta_display.append("["+nickName+"]"+msg2+"\n");
					};
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
