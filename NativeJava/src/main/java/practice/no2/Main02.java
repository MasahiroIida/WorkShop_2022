package practice.no2;

import java.util.ArrayList;
import java.util.List;

public class Main02 {

	public static void main(String[] args) {
		///////////////////////////
		// �ϐ���N���X�ɂ���
		///////////////////////////
		
		// �ϐ���final��t����Ə㏑���s��(�C�~���[�^�u��)�ɂȂ�
		final int num = 1;

		// �ϐ���static��t����ƃC���X�^���X�����Ȃ��Ă��Q�Ƃł���
		System.out.println(Utils.TEST);
		// ���\�b�h���ꏏ
		Utils.print("static���\�b�h�̃e�X�g");
		
		
		// interface�Ǝ����ɂ���
		
		// interface�͋K��̂悤�Ȃ���
		// �����N���X�ɑ΂��āAinterface�������\�b�h���������邱�Ƃ���������
		// �����N���X�̃C���X�^���X��interface�̌^�Ŏ󂯂邱�Ƃ��ł���
		Book jump = new Jump();
		Book magazine = new Magagine();
		jump.read();
		magazine.read();
		
		// �C���^�[�t�F�[�X�̌^�ň������ƂŃC���X�^���X�����̃N���X�Ȃ̂����ӎ����Ȃ��ėǂ�
		List<Book> list = new ArrayList<>();
		list.add(jump);
		list.add(magazine);
		for(Book book : list) {
			book.read();
		}
		
		// �p���ɂ���
		// �N���X�̓T�u�N���X����邱�Ƃ��o����
		
		
		// ���ۉ��ɂ���
		// �N���X�̋��ʓI�ȏ����𒊏ۃN���X�Ɏ�������
	}

}
