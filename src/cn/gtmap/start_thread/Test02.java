package cn.gtmap.start_thread;

/**
 * ʹ�ö��̣߳��Ϳ������������ڹ�����Ī��ͬʱ���ͽ�����Ҳ�ڹ���äɮ 
 * 	���һ����KillThread �̳�Thread��������дrun���� 
 * 	�����̰߳취�� ʵ����һ��KillThread���󣬲��ҵ�����start���� 
 * 	�Ϳ��Թ۲쵽 �ͽ����˹���äɮ��ͬʱ������Ҳ�ڹ�����Ī
 *
 */
public class Test02 {
    public static void main(String[] args) {
        
        Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 616;
        gareen.damage = 50;
 
        Hero teemo = new Hero();
        teemo.name = "��Ī";
        teemo.hp = 300;
        teemo.damage = 30;
         
        Hero bh = new Hero();
        bh.name = "�ͽ�����";
        bh.hp = 500;
        bh.damage = 65;
         
        Hero leesin = new Hero();
        leesin.name = "äɮ";
        leesin.hp = 455;
        leesin.damage = 80;
         
        KillThread killThread1 = new KillThread(gareen,teemo);
        killThread1.start();
        KillThread killThread2 = new KillThread(bh,leesin);
        killThread2.start();
         
    }
}