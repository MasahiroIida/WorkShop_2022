package practice.no1;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

	//
	// Java��main���\�b�h�����s���邱�ƂŃA�v���P�[�V�����Ƃ��ē��삷��
	//
	public static void main(String[] args) {
		///////////////////////////
		// �^�ɂ���
		///////////////////////////

		// �^�̓v���~�e�B�u�ƃN���X�I�u�W�F�N�g��2��ނ�����

		// �v���~�e�B�u�͂��̂܂ܒl��ݒ肷��Ύg����
		// int, long, double, byte��
		int number = 1;
		System.out.println("number : " + number);

		// �N���X�I�u�W�F�N�g�̓C���X�^���X�����K�v
		// �C���X�^���X�����邽�߂ɂ̓R���X�g���N�^���Ăяo��
		Book book = new Book();

		// �R���X�g���N�^�Ăяo�����ɏ����l��ݒ肷��̂��Z�I���[
		Book jump = new Book("�T����", 300, 290);

		// Integer, Long, Double�̓v���~�e�B�u�̃��b�p�[�N���X
		// �N���X�I�u�W�F�N�g�����ǁAautoboxing����̂Ńv���~�e�B�u�ƌ݊���������
		Integer num = 1;

		///////////////////////////
		// if����loop���ɂ���
		///////////////////////////

		// if���� if(boolean) �ŏo����
		int count = 0;
		count++;
		if (count == 1) {
			//
		} else if (count == 2) {
			//
		} else {
			//
		}

		// for�͕��ʂ�for���A�g��for���Astream��for��������
		
		// ���ʂ�for��
		for(int i = 0; i < 10; i ++) {
			// ����قƂ�ǎg��Ȃ�
		}
		
		// List�̓��X�g��interface�N���X�AArrayList�͎����N���X
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		// �g��for��
		for(String str : list) {
			// ����߂���悭�g��
		}

		// stream��for��
		list.forEach(v -> {
			// Java8�ȍ~���ƂقƂ�ǂ���
		}); 
	}
}
