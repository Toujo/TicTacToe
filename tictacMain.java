import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tictacMain extends JFrame{
	int player = 1;
	int turnCount = 0;
	int xo[] = new int[10];
	int GameState = 0;
	int xPoint = 0, yPoint = 0;
	ImageIcon X,O;
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	JPanel grid = new JPanel();
	JLabel playerX = new JLabel("Player X");
	JLabel playerY = new JLabel("Player O");
	JLabel xScore = new JLabel(xPoint +"");
	JLabel yScore = new JLabel(yPoint +"");
	JPanel scoreBoard = new JPanel();
	
	public tictacMain(){
		setSize(500,600);
		setTitle("Tic Tac Toe Game");
		setResizable(false);
		setLocationRelativeTo(null);
		frame();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void frame(){
		Container cn = getContentPane();
        cn.setLayout(null);
        X=new ImageIcon(this.getClass().getResource("X.png"));
		O=new ImageIcon(this.getClass().getResource("O.png"));
		for(int a=0; a<10; a++){
			xo[a] = 0;
		}
        grid.setBounds((getWidth()/2)-150,(getHeight()/2)-100,300,300);
        grid.setLayout(new GridLayout(3,3));
        b1.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ex){
        		player++;
        		int B1 = (player %= 2);
        		if(B1 == 0) xo[1] = 1;
        		else if(B1 == 1) xo[1] = 2;
        		GameState = 1;;
        		if(xo[1] == 1) b1.setIcon(X);
        		else if(xo[1] == 2) b1.setIcon(O);
        		turnCount++;
        		b1.setEnabled(false);
        		winChecker();
        	}
        });
        b2.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ex){
        		player++;
        		int B2 = (player %= 2);
        		if(B2 == 0) xo[2] = 1;
        		else if(B2 == 1) xo[2] = 2;
        		GameState = 1;;
        		if(xo[2] == 1) b2.setIcon(X);
        		else if(xo[2] == 2) b2.setIcon(O);
        		turnCount++;
        		b2.setEnabled(false);
        		winChecker();
        	}
        });
        b3.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ex){
        		player++;
        		int B3 = (player %= 2);
        		if(B3 == 0) xo[3] = 1;
        		else if(B3 == 1) xo[3] = 2;
        		GameState = 1;;
        		if(xo[3] == 1) b3.setIcon(X);
        		else if(xo[3] == 2) b3.setIcon(O);
        		turnCount++;
        		b3.setEnabled(false);
        		winChecker();
        	}
        });
        b4.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ex){
        		player++;
        		int B4 = (player %= 2);
        		if(B4 == 0) xo[4] = 1;
        		else if(B4 == 1) xo[4] = 2;
        		GameState = 1;;
        		if(xo[4] == 1) b4.setIcon(X);
        		else if(xo[4] == 2) b4.setIcon(O);
        		turnCount++;
        		b4.setEnabled(false);
        		winChecker();
        	}
        });
        b5.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ex){
        		player++;
        		int B5 = (player %= 2);
        		if(B5 == 0) xo[5] = 1;
        		else if(B5 == 1) xo[5] = 2;
        		GameState = 1;;
        		if(xo[5] == 1) b5.setIcon(X);
        		else if(xo[5] == 2) b5.setIcon(O);
        		turnCount++;
        		b5.setEnabled(false);
        		winChecker();
        	}
        });
        b6.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ex){
        		player++;
        		int B6 = (player %= 2);
        		if(B6 == 0) xo[6] = 1;
        		else if(B6 == 1) xo[6] =2;
        		GameState = 1;;
        		if(xo[6] == 1) b6.setIcon(X);
        		else if(xo[6] ==2) b6.setIcon(O);
        		turnCount++;
        		b6.setEnabled(false);
        		winChecker();
        	}
        });
        b7.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ex){
        		player++;
        		int B7 = (player %= 2);
        		if(B7 == 0) xo[7] = 1;
        		else if(B7 == 1) xo[7] = 2;
        		GameState = 1;;
        		if(xo[7] == 1) b7.setIcon(X);
        		else if(xo[7] == 2) b7.setIcon(O);
        		turnCount++;
        		b7.setEnabled(false);
        		winChecker();
        	}
        });
        b8.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ex){
        		player++;
        		int B8 = (player %= 2);
        		if(B8 == 0) xo[8] = 1;
        		else if(B8 == 1) xo[8] = 2;
        		GameState = 1;;
        		if(xo[8] == 1) b8.setIcon(X);
        		else if(xo[8] == 2) b8.setIcon(O);
        		GameState = 1;;
        		b8.setEnabled(false);
        		winChecker();
        		turnCount++;
        	}
        });
        b9.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent ex){
        		player++;
        		int B9 = (player %= 2);
        		if(B9 == 0) xo[9] = 1;
        		else if(B9 == 1) xo[9] = 2;
        		
        		if(xo[9] == 1) b9.setIcon(X);
        		else if(xo[9] == 2) b9.setIcon(O);
        		GameState = 1;
        		b9.setEnabled(false);
        		winChecker();
        		turnCount++;
        	}
        });
        grid.add(b1);
        grid.add(b2);
        grid.add(b3);
        grid.add(b4);
        grid.add(b5);
        grid.add(b6);
        grid.add(b7);
        grid.add(b8);
        grid.add(b9);
        
        scoreBoard.setBounds(0,0, getWidth(), 150);
        scoreBoard.setBackground(new Color(87,227,227));
        scoreBoard.setLayout(null);
        playerX.setBounds(30,10, 150, 50);
        playerY.setBounds(scoreBoard.getWidth() - 100, 10, 150, 50);
        xScore.setBounds(30, 60, 150, 50);
        yScore.setBounds(scoreBoard.getWidth() - 100, 60, 150, 50);
        
        scoreBoard.add(playerX);
        scoreBoard.add(playerY);
        scoreBoard.add(xScore);
        scoreBoard.add(yScore);
        
        
        cn.add(grid);
        cn.add(scoreBoard);
	}
	
	void winChecker(){
		 if(GameState == 1){
	        if(((xo[1] == 1) && (xo[2] == 1) && (xo[3] == 1)) || (xo[1] == 2)&&(xo[2] == 2)&&(xo[3] == 2)){
		       	if(((xo[1] == 1) && (xo[2] == 1) && (xo[3] == 1))){ 
		       		JOptionPane.showMessageDialog(null, "Player X wins!!");
		       		xPoint++;
		       		xScore.setText(xPoint+"");
		       		resetAll();
		       		GameState = 0;
		       		turnCount = 0;
		       	}
		       	else if((xo[1] == 2)&&(xo[2] == 2)&&(xo[3] == 2)){
		       		 JOptionPane.showMessageDialog(null, "Player O wins!!");
		       		 yPoint++;
		       		 resetAll();
		       		 GameState = 0;
		       		 turnCount = 0;
		       	}
		       	 
		   	}
		   	else if(((xo[4] == 1) && (xo[5] == 1) && (xo[6] == 1)) || (xo[4] == 2)&&(xo[5] == 2)&&(xo[6] == 2)){
		       	if((xo[4] == 1) && (xo[5] == 1) && (xo[6] == 1)){ 
		       		JOptionPane.showMessageDialog(null, "Player X wins!!");
		       		xPoint++;
		       		xScore.setText(xPoint+"");
		       		resetAll();
		       		GameState = 0;
		       		turnCount = 0;
		       	}
		       	else if((xo[4] == 2)&&(xo[5] == 2)&&(xo[6] == 2)){
		       		 JOptionPane.showMessageDialog(null, "Player O wins!!");
		       		 yPoint++;
		       		 resetAll();
		       		 GameState = 0;
		       		 turnCount = 0;
		       	} 
		   	}
		   	else if(((xo[7] == 1) && (xo[8] == 1) && (xo[9] == 1)) || (xo[7] == 2)&&(xo[8] == 2)&&(xo[9] == 2)){
		       	if((xo[7] == 1) && (xo[8] == 1) && (xo[9] == 1)){ 
		       		JOptionPane.showMessageDialog(null, "Player X wins!!");
		       		xPoint++;
		       		xScore.setText(xPoint+"");
		       		resetAll();
		       		GameState = 0;
		       		turnCount = 0;
		       	}
		       	else if((xo[7] == 2)&&(xo[8] == 2)&&(xo[9] == 2)){
		       		 JOptionPane.showMessageDialog(null, "Player O wins!!");
		       		 yPoint++;
		       		 yScore.setText(yPoint+"");
		       		 resetAll();
		       		 GameState = 0;
		       		 turnCount = 0;
		       	} 
		   	}
		   	else if(((xo[1] == 1) && (xo[4] == 1) && (xo[7] == 1)) || (xo[1] == 2)&&(xo[4] == 2)&&(xo[7] == 2)){
		       	if((xo[1] == 1) && (xo[4] == 1) && (xo[7] == 1)){ 
		       		JOptionPane.showMessageDialog(null, "Player X wins!!");
		       		xPoint++;
		       		xScore.setText(xPoint+"");
		       		resetAll();
		       		GameState = 0;
		       		turnCount = 0;
		       	}
		       	else if((xo[1] == 2)&&(xo[4] == 2)&&(xo[7] == 2)){
		       		 JOptionPane.showMessageDialog(null, "Player O wins!!");
		       		 yPoint++;
		       		 yScore.setText(yPoint+"");
		       		 resetAll();
		       		 GameState = 0;
		       		 turnCount = 0;
		       	} 
		   	}
		   	else if(((xo[2] == 1) && (xo[5] == 1) && (xo[8] == 1)) || (xo[2] == 2)&&(xo[5] == 2)&&(xo[8] == 2)){
		       	if((xo[2] == 1) && (xo[5] == 1) && (xo[8] == 1)){ 
		       		JOptionPane.showMessageDialog(null, "Player X wins!!");
		       		xPoint++;
		       		xScore.setText(xPoint+"");
		       		resetAll();
		       		GameState = 0;
		       		turnCount = 0;
		       	}
		       	else if((xo[2] == 2)&&(xo[5] == 2)&&(xo[8] == 2)){
		       		 JOptionPane.showMessageDialog(null, "Player O wins!!");
		       		 yPoint++;
		       		 yScore.setText(yPoint+"");
		       		 resetAll();
		       		 GameState = 0;
		       		 turnCount = 0;
		       	} 
		   	}
		   	else if(((xo[3] == 1) && (xo[6] == 1) && (xo[9] == 1)) || (xo[3] == 2)&&(xo[6] == 2)&&(xo[9] == 2)){
		       	if((xo[3] == 1) && (xo[6] == 1) && (xo[9] == 1)){ 
		       		JOptionPane.showMessageDialog(null, "Player X wins!!");
		       		xPoint++;
		       		xScore.setText(xPoint+"");
		       		resetAll();
		       		GameState = 0;
		       		turnCount = 0;
		       	}
		       	else if((xo[3] == 2)&&(xo[6] == 2)&&(xo[9] == 2)){
		       		 JOptionPane.showMessageDialog(null, "Player O wins!!");
		       		 yPoint++;
		       		 yScore.setText(yPoint+"");
		       		 resetAll();
		       		 GameState = 0;
		       		 turnCount = 0;
		       	} 
		   	}
		   	else if(((xo[1] == 1) && (xo[5] == 1) && (xo[9] == 1)) || (xo[1] == 2)&&(xo[5] == 2)&&(xo[9] == 2)){
		       	if((xo[1] == 1) && (xo[5] == 1) && (xo[9] == 1)){ 
		       		JOptionPane.showMessageDialog(null, "Player X wins!!");
		       		xPoint++;
		       		xScore.setText(xPoint+"");
		       		resetAll();
		       		GameState = 0;
		       		turnCount = 0;
		       	}
		       	else if((xo[1] == 2)&&(xo[5] == 2)&&(xo[9] == 2)){
		       		 JOptionPane.showMessageDialog(null, "Player O wins!!");
		       		 yPoint++;
		       		 yScore.setText(yPoint+"");
		       		 resetAll();
		       		 GameState = 0;
		       		 turnCount = 0;
		       	} 
		   	}
		   	else if(((xo[3] == 1) && (xo[5] == 1) && (xo[7] == 1)) || (xo[3] == 2)&&(xo[5] == 2)&&(xo[7] == 2)){
		       	if((xo[3] == 1) && (xo[5] == 1) && (xo[7] == 1)){ 
		       		JOptionPane.showMessageDialog(null, "Player X wins!!");
		       		xPoint++;
		       		xScore.setText(xPoint+"");
		       		resetAll();
		       		GameState = 0;
		       		turnCount = 0;
		       	}
		       	else if((xo[3] == 2)&&(xo[5] == 2)&&(xo[7] == 2)){
		       		 JOptionPane.showMessageDialog(null, "Player O wins!!");
		       		 yPoint++;
		       		 yScore.setText(yPoint+"");
		       		 resetAll();
		       		 GameState = 0;
		       		 turnCount = 0;
		       	} 
		   	}
		   	else if(turnCount == 9){ 
		       		JOptionPane.showMessageDialog(null, "Draw!");
		       		resetAll();
		       		GameState = 0;
		       		turnCount = 0;
		    }
	     }	
	}
	
	void resetAll(){
		xScore.setText(xPoint+"");
		yScore.setText(yPoint+"");
		for(int a = 0; a<10; a++){
			xo[a] = 0;
		}
		player = 1;
		b1.setIcon(null);
		b1.setEnabled(true);
		b2.setIcon(null);
		b2.setEnabled(true);
		b3.setIcon(null);
		b3.setEnabled(true);
		b4.setIcon(null);
		b4.setEnabled(true);
		b5.setIcon(null);
		b5.setEnabled(true);
		b6.setIcon(null);
		b6.setEnabled(true);
		b7.setIcon(null);
		b7.setEnabled(true);
		b8.setIcon(null);
		b8.setEnabled(true);
		b9.setIcon(null);
		b9.setEnabled(true);
		
		JOptionPane.showMessageDialog(null, "Click on any square to play! X is first to play!");
		
	}
	
	public static void main(String Iowa[]){
		JOptionPane.showMessageDialog(null, "Click on any square to play! X is first to play!");
		new tictacMain();
	}
}