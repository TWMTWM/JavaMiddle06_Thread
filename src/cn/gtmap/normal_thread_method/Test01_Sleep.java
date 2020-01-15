package cn.gtmap.normal_thread_method;

/**
 * Thread.sleep(1000); ��ʾ��ǰ�߳���ͣ1000���� �������̲߳���Ӱ�� 
 * Thread.sleep(1000); ���׳�InterruptedException �ж��쳣����Ϊ��ǰ�߳�sleep��ʱ���п��ܱ�ֹͣ����ʱ�ͻ��׳� InterruptedException
 *
 */
public class Test01_Sleep {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				int seconds = 0;
				while(true){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.printf("�Ѿ�����LoL %d ��%n",seconds++);
				}
			}
		};
		t1.start();
	}
}
