package Mnogopotochka;


//1. �������� ���������, ���������� �����������
//���������������� ����� �� �������.
//��� ����� ������������ ����� ���������� ������.
//��� ������ ����� �����, ������ ����������� ������,
// ������� �������� �� �������� ����� ������ � ����� ������� "� ���� N ������".
//������ ����� ������� ���, ����� ��� ������ ����������� � ����� � ��� �� ������ � ������� �����.
// �.�. � ��������� ���� 2 ������: ������� � ����� ��� ���������� ���� ����� �� �������.
//��� ����� �������������� ����� ��������� ������ ��������� ���� ������.
//������ ������� - ��������� ������� � ����. ��������� ���-�� ������������ ����� ������ �������

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DZmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("������� ���������� ������");
            long sec = scanner.nextLong();
            if (sec <0) {
                break;
            }
            try {
                MyThead.sleep(sec * 1000);
                System.out.println("� ���� " + sec + " ���");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
