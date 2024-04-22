package basic0118;

public class Info extends Health {
//	  �ʵ�� : double s_weight (ǥ��ü��)
//      double fat      (�񸸵�)
//      String result   (�����)
//������ : s_weight = 0.0; (�ʱ�ȭ�۾�)
//      fat = 0.0;
//      result = null;
//�޼ҵ� : calculate() - �񸸵� ���
//      output2()  - ���

	double s_weight ;
	double fat;
	String result;

	Info(){
		s_weight = 0.0;
		fat = 0.0;
		result = null;
	}
	//Health �𷡽��� ����� �ҷ���
//	Info(char c , double d, double w){
//		super();
//	}
	//�� �ڵ�� ���� ����� �Ǵ� �� ����. 
	//super method�� ����  ���� �� ���ذ� �ʿ��� �� ����. 
	
	
	//Info Ŭ������ ������ �����ϴ� Part
	public void  calculate() {
		//������ ���� ǥ�� ü�� ��ȭ
		if( this.gender == 'm') {
			this.s_weight = (this.tall - 100) * 0.9;
			
		}
		else if(this.gender == 'f') {
			this.s_weight =(this.tall-100) * 0.85;
		}
		
		//�񸸵� ����
		fat = (this.weight /this.s_weight) * 100;
		
		//�񸸵��� ���� result�� ��ȯ
		//���⸦ ���� �� ª�� �� �� ��������?
		if(fat<=90) {
			result =String.format("����� �񸸵� %.2f�̰�, ��ü���Դϴ�.", fat);
		}
		else if(fat<=110 && fat>90) {
			result =String.format("����� �񸸵� %.2f�̰�, ����(ǥ��ü��)�Դϴ�.", fat);
		}
		else if(fat>110&&fat<=120) {
			result =String.format("����� �񸸵� %.2f�̰�, ��ü�� �Դϴ�.", fat);
		}
		else if(fat<=130 && fat>120) {
			result =String.format("����� �񸸵� %.2f�̰�, �浵�� �Դϴ�.", fat);
		}
		else if(fat<=150&& fat>130) {
			result =String.format("����� �񸸵� %.2f�̰�, �ߵ��� �Դϴ�.", fat);
		}
		else  {
			result =String.format("����� �񸸵� %.2f�̰�, ���� �Դϴ�.", fat);
		}

	}
	
	public String output2() {
		
		return result;
	}

}
//����� �񸸵� 140.84�̰�,  �ߵ��� �Դϴ�.
//���� : ǥ��ü�� = (����-100)*0.9
//���� : ǥ��ü�� = (����-100)*0.85
//
//�񸸵� = ����ü��(Kg)/ǥ��ü��(Kg)*100
//--------------------------------------------------
//90%����  : ��ü��               121-130% : �浵��
//91 -110% : ����(ǥ��ü��)       131-150% : �ߵ���
//111-120% : ��ü��               150%     : ����

