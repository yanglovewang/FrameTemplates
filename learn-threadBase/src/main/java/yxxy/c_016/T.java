/**
 * synchronized�Ż�
 * ͬ��������е����Խ��Խ��
 * �Ƚ�m1��m2
 * @author mashibing
 */
package yxxy.c_016;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class T {
	
	int count = 0;

	synchronized void m1() {
		//do sth need not sync
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//ҵ���߼���ֻ�����������Ҫsync����ʱ��Ӧ�ø�������������
		count ++;
		
		//do sth need not sync
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void m2() {
		//do sth need not sync
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//ҵ���߼���ֻ�����������Ҫsync����ʱ��Ӧ�ø�������������
		//����ϸ���ȵ���������ʹ�߳�����ʱ���̣��Ӷ����Ч��
		synchronized(this) {
			count ++;
		}
		//do sth need not sync
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	

}
