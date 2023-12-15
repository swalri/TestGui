package test;

import java.awt.*;//폰트 등 그래픽 처리를 위한 클래스들의 경로명
import java.awt.event.*;//이벤트 처리에 필요한 기본 클래스들의 경로명
import javax.swing.*;//스윙 컴포넌트 클래스들의 경로명
import javax.swing.event.*;//스윙 이벤트 처리에 필요한 클래스들의 경로명

//메인 클래스
//메인화면 구현
public class MainGui extends JFrame {
	// 메인 화면
	public MainGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 프레임 윈도우 종료시 프로그램 종료
//		super("메인화면2");// 화면 제목
		setTitle("메인 화면");// 화면 제목
		setSize(800, 600);// 가로,세로 픽셀

		Container con = getContentPane();// JFrame생성시 자동으로 생성되는 컨텐트팬을 가져온다
		con.setLayout(new GridLayout(3, 3));// 배치하는 방시 설정
		JButton btn1 = new JButton("Click");// Click이라는 이름의 버튼 생성
		JButton btn2 = new JButton("Click");// Click이라는 이름의 버튼 생성
		JButton btn3 = new JButton("Click");// Click이라는 이름의 버튼 생성
		JButton btn4 = new JButton("Click");// Click이라는 이름의 버튼 생성
		JButton btn5 = new JButton("Click");// Click이라는 이름의 버튼 생성
		JButton btn6 = new JButton("Click");// Click이라는 이름의 버튼 생성
		JButton btn7 = new JButton("Click");// Click이라는 이름의 버튼 생성
		JButton btn8 = new JButton("Click");// Click이라는 이름의 버튼 생성
		JButton btn9 = new JButton("Click");// Click이라는 이름의 버튼 생성
		con.add(btn1);
		con.add(btn2);
		con.add(btn3);
		con.add(btn4);
		con.add(btn5);
		con.add(btn6);
		con.add(btn7);
		con.add(btn8);
		con.add(btn9);

		setVisible(true);// 프레임 출력
	}

	public static void main(String[] args) {
		MainGui myframe = new MainGui();

//		myframe.setContentPane(new MyPanel());
	}
}

class MyPanel extends JPanel {
	public void MyPanel() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		JButton v = new JButton("aa");
		jp.add(v);
	}

}