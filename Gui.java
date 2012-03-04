import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 *Contains the instance Variables for the GUI class.
 **/
public class Gui extends JFrame
{
    //################ INSTANCE VARIABLES #####################
    private JTextField name1;
    private JTextField name2;
    private int totalP1 = 0;
    private int totalP2 = 0;
    private int bonusP1 = 0;
    private int bonusP2 = 0;
    private int checkBonusP1 = 0;
    private int checkBonusP2 = 0;
    private JCheckBox o2;
    private Container cont;
    private GuiGame theGame;
    private int nrOfTosses = 0;
    private int player = 2;
    private int nrOfPlayers = 0;
    private int rounds = 0;
    
    private JMenuItem menu; //Menyn
     
    private JPanel west;
    private JPanel center;
    private JPanel east;
    private JPanel south;
    private Yatzy yatzy;
    
    private JLabel dice1;
    private JLabel dice2;
    private JLabel dice3;
    private JLabel dice4;
    private JLabel dice5;
    private JLabel lTotalP1;
    private JLabel lTotalP2;
    
    private JButton roll;
    private JButton done;
    private ButtonGroup groupP1;
    private JRadioButton unSelectedP1;
    private JRadioButton unSelectedP2;
    
    private JCheckBox hold1;
    private JCheckBox hold2;
    private JCheckBox hold3;
    private JCheckBox hold4;
    private JCheckBox hold5;
    
    private JRadioButton lEttorP1;
    private JRadioButton lTvaorP1;
    private JRadioButton lTreorP1;
    private JRadioButton lFyrorP1;
    private JRadioButton lFemmorP1;
    private JRadioButton lSexorP1;
    private JRadioButton lParP1;
    private JRadioButton lTvaParP1;
    private JRadioButton lTrissP1;
    private JRadioButton lFyrtalP1;
    private JRadioButton lKakP1;
    private JRadioButton lLitenStegeP1;
    private JRadioButton lStorStegeP1;
    private JRadioButton lChansP1;
    private JRadioButton lYatzyP1;
    
    
    private JRadioButton lEttorP2;
    private JRadioButton lTvaorP2;
    private JRadioButton lTreorP2;
    private JRadioButton lFyrorP2;
    private JRadioButton lFemmorP2;
    private JRadioButton lSexorP2;
    private JRadioButton lParP2;
    private JRadioButton lTvaParP2;
    private JRadioButton lTrissP2;
    private JRadioButton lFyrtalP2;
    private JRadioButton lKakP2;
    private JRadioButton lLitenStegeP2;
    private JRadioButton lStorStegeP2;
    private JRadioButton lChansP2;
    private JRadioButton lYatzyP2;
    
    
    private JTextField tEttorP1;
    private JTextField tTvaorP1;
    private JTextField tTreorP1;
    private JTextField tFyrorP1;
    private JTextField tFemmorP1;
    private JTextField tSexorP1;
    private JTextField tBonusP1;
    private JTextField tParP1;
    private JTextField tTvaParP1;
    private JTextField tTrissP1;
    private JTextField tFyrtalP1;
    private JTextField tKakP1;
    private JTextField tLitenStegeP1;
    private JTextField tStorStegeP1;
    private JTextField tChansP1;
    private JTextField tYatzyP1;
    private JTextField tTotalP1;
    
    private JTextField tEttorP2;
    private JTextField tTvaorP2;
    private JTextField tTreorP2;
    private JTextField tFyrorP2;
    private JTextField tFemmorP2;
    private JTextField tSexorP2;
    private JTextField tBonusP2;
    private JTextField tParP2;
    private JTextField tTvaParP2;
    private JTextField tTrissP2;
    private JTextField tFyrtalP2;
    private JTextField tKakP2;
    private JTextField tLitenStegeP2;
    private JTextField tStorStegeP2;
    private JTextField tChansP2;
    private JTextField tYatzyP2;
    private JTextField tTotalP2;
    
    //#################### DEFAULT CONSTRUCTOR #####################
    /**
     *Default Constructor
     **/
    public Gui() {
		super();

		try {
			// Set System L&F
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		buildFrame();
		buildWest();
		buildCenter();
		buildEast();
		buildSouth();
	}
    
    // ################### BUILD FRAME ##############################
    /**
	 * Sets the windows size, title as well as closing operation
	 */
    public void buildFrame()
    {
        setBounds(400,250,300,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("V�lkommen");
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
    }
    
    //################### BUILD WEST PANEL #########################
    /**
     *Builds the west part of the game window.
     **/
    public void buildWest()
    {
        west = new JPanel(new GridLayout(3,1,5,5));
        
        JLabel empty1 = new JLabel("");
        JLabel player1 = new JLabel("Spelare 1: ");
        JLabel player2 = new JLabel("Spelare 2: ");
        
        west.add(empty1);
        west.add(player1);
        west.add(player2);
        
        cont.add(west, BorderLayout.WEST);
    }
    
    //################### BUILD CENTER PANEL ########################
    /**
     *Builds the center part of the game window.
     **/
    public void buildCenter()
    {
        center = new JPanel(new GridLayout(3,1,5,5));
        
        JLabel typeName = new JLabel(" Fyll i namn");
        name1 = new JTextField(10);
        name2 = new JTextField(10);
        name2.setEnabled(false);
        
        center.add(typeName);
        center.add(name1);
        center.add(name2);
        
        cont.add(center, BorderLayout.CENTER);
    }
    
    //################## BUILD EAST PANEL ###########################
    /**
     *Builds the east part of the game window.
     **/    
    public void buildEast()
    {
        east = new JPanel(new GridLayout(3,1,5,5));
        
        JLabel empty2 = new JLabel("");
        JCheckBox o1 = new JCheckBox("",true);
        o2 = new JCheckBox("");
        
        east.add(empty2);
        east.add(o1);
        
        
        o2.addItemListener(new CheckBoxListener());
        east.add(o2);
        
        cont.add(east, BorderLayout.EAST);
    }
    
    //################## BUILD SOUTH PANEL ############################
    /**
     *Builds the south part of the game window.
     **/
    public void buildSouth()
    {
        south = new JPanel(new FlowLayout());
        
        JButton okey = new JButton("OK");
        JButton cancel = new JButton("Cancel");
        
        south.add(cancel);
        south.add(okey);
        cancel.addActionListener(new ButtonListener());
        okey.addActionListener(new ButtonListener());
        
        cont.add(south, BorderLayout.SOUTH);
    }
    
     /**
     *Instance Variables for the windowparts
     **/
    public class GuiGame extends JFrame
    {
        //######################### Instance Variables ########################
        Container cont;
        
        JPanel north;
        JPanel northWest;
        JPanel northEast;
        
        JPanel west;
        JPanel center;
        JPanel east;
        JPanel south;
        
        String player1;
        String player2;
        
        
        
        //####################### Default Constructor ##########################
        /**
         *Builds the Game window.
         *@param parsedPlayer1 Player one's name as a String
         *@param parsedPlayer2 Player two's name as a String
         **/
        public GuiGame(String parsedPlayer1, String parsedPlayer2)
        {
            
            
            super();
            player1 = parsedPlayer1;
            player2 = parsedPlayer2;
            
            yatzy = new Yatzy();
            if(!player1.equals(""))
            yatzy.setNameP1(player1);
            if(!player2.equals(""))
            yatzy.setNameP2(player2);
            
            buildFrame();
            buildNorth();
            buildNorthWest();
            buildNorthEast();
            buildWest();
            buildCenter();
            buildEast();
            buildMenu();
            
        }
        
        //###################### Build Frame ###################################
        /**
         *Builds the Game window.
         **/
        public void buildFrame()
        {
            setBounds(200,100, 900, 750);
            setTitle("Yatzy");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            cont = getContentPane();
            cont.setLayout(new BorderLayout());
            
        }
        
        //###################### Build North ####################################
        /**
         *Builds the north part of the game window.
         **/
        public void buildNorth()
        {
            north = new JPanel(new GridLayout(1,2,5,5));
            cont.add(north, BorderLayout.NORTH);
        }
        
        //##################### Build NorthWest ################################
        /**
         *Builds the northwest part of the game window.
         **/
        public void buildNorthWest()
        {
            northWest = new JPanel(new GridLayout(1,4,5,5));
            
            JLabel empty1 = new JLabel("");
            JLabel empty2 = new JLabel("");
            done = new JButton("Klar");
            done.setEnabled(false);
            done.addActionListener(new ButtonListener());
            roll = new JButton("Kasta");
            roll.addActionListener(new ButtonListener());
            
            northWest.add(empty1);
            northWest.add(empty2);
            northWest.add(done);
            northWest.add(roll);
            
            north.add(northWest);
        }
        
        //##################### Build Menu ##########################
        /**
         *Builds the Menu
         **/
        public void buildMenu()
        {
        	JMenu yatzyMenu = new JMenu("Yatzy");
        	
	       	menu = new JMenuItem("Regler");
        	menu.addActionListener(new ButtonListener());
        	yatzyMenu.add(menu);
        	
        	menu = new JMenuItem("Hj�lp");
        	menu.addActionListener(new ButtonListener());
        	yatzyMenu.add(menu);
        	
			menu = new JMenuItem("Avsluta");
        	menu.addActionListener(new ButtonListener());
        	yatzyMenu.add(menu);
        	
        	JMenuBar menu = new JMenuBar();
        	menu.add(yatzyMenu);
        	setJMenuBar(menu);
        }
        
        //##################### Build NorthEast #################################
        /**
         *Builds the northEast part of the game window.
         **/
        public void buildNorthEast()
        {
            northEast = new JPanel(new GridLayout(2,7,5,5));
            
            JLabel empty1 = new JLabel("");
            dice1 = new JLabel();
            dice2 = new JLabel();
            dice3 = new JLabel();
            dice4 = new JLabel();
            dice5 = new JLabel();
                        
            JLabel empty2 = new JLabel("");
            
            JLabel hempty1 = new JLabel("");
            hold1 = new JCheckBox();
            hold1.addItemListener(new CheckBoxListener());
            hold2 = new JCheckBox();
            hold2.addItemListener(new CheckBoxListener());
            hold3 = new JCheckBox();
            hold3.addItemListener(new CheckBoxListener());
            hold4 = new JCheckBox();
            hold4.addItemListener(new CheckBoxListener());
            hold5 = new JCheckBox();
            hold5.addItemListener(new CheckBoxListener());
            JLabel hempty2 = new JLabel("");
            
            northEast.add(empty1);
            northEast.add(dice1);
            northEast.add(dice2);
            northEast.add(dice3);
            northEast.add(dice4);
            northEast.add(dice5);
            northEast.add(empty2);
            
            northEast.add(hempty1);
            northEast.add(hold1);
            northEast.add(hold2);
            northEast.add(hold3);
            northEast.add(hold4);
            northEast.add(hold5);
            northEast.add(hempty2);
            
            north.add(northEast);
        }
        
        //##################### Build West ###############################
        /**
         *Builds the west part of the game window.
         **/
        public void buildWest()
        {
            west = new JPanel(new GridLayout(19,2, 5,5));
            
            JLabel empty1 = new JLabel("");     JLabel pName1 = new JLabel(yatzy.getNameP1());
            tEttorP1 = new JTextField(2);     lEttorP1 = new JRadioButton("Ettor");
            tTvaorP1 = new JTextField(2);     lTvaorP1 = new JRadioButton("Tv�or");
            tTreorP1 = new JTextField(2);     lTreorP1 = new JRadioButton("Treor");
            tFyrorP1 = new JTextField(2);     lFyrorP1 = new JRadioButton("Fyror");
            tFemmorP1 = new JTextField(2);    lFemmorP1 = new JRadioButton("Femmor");
            tSexorP1 = new JTextField(2);     lSexorP1 = new JRadioButton("Sexor");
            tBonusP1 = new JTextField(2);     JLabel lBonus = new JLabel("Bonus");
            JLabel tEmpty = new JLabel("");     JLabel lEmpty = new JLabel("");
            tParP1 = new JTextField(2);       lParP1 = new JRadioButton("Par");
            tTvaParP1 = new JTextField(2);    lTvaParP1 = new JRadioButton("Tv� Par");
            tTrissP1 = new JTextField(2);     lTrissP1 = new JRadioButton("Triss");
            tFyrtalP1 = new JTextField(2);    lFyrtalP1 = new JRadioButton("Fyrtal");
            tKakP1 = new JTextField(2);       lKakP1 = new JRadioButton("K�k");
            tLitenStegeP1 = new JTextField(2); lLitenStegeP1 = new JRadioButton("Liten Stege");
            tStorStegeP1 = new JTextField(2); lStorStegeP1 = new JRadioButton("Stor Stege");
            tChansP1 = new JTextField(2);     lChansP1 = new JRadioButton("Chans");
            tYatzyP1 = new JTextField(2);     lYatzyP1 = new JRadioButton("Yatzy");
            tTotalP1 = new JTextField(2);	  lTotalP1 = new JLabel("Total");
            
            unSelectedP1 = new JRadioButton("OMFG!!!!111oneoneoneoennoeonenoep0WTFnub");
            
            
            
            //############## Inaktiverar Player 1's testrutor #################
            tEttorP1.setEnabled(false);
            tTvaorP1.setEnabled(false);
            tTreorP1.setEnabled(false);
            tFyrorP1.setEnabled(false);
            tFemmorP1.setEnabled(false);
            tSexorP1.setEnabled(false);
            tBonusP1.setEnabled(false);
            tParP1.setEnabled(false);
            tTvaParP1.setEnabled(false);
            tTrissP1.setEnabled(false);
            tFyrtalP1.setEnabled(false);
            tKakP1.setEnabled(false);
            tLitenStegeP1.setEnabled(false);
            tStorStegeP1.setEnabled(false);
            tChansP1.setEnabled(false);
            tYatzyP1.setEnabled(false);
            tTotalP1.setEnabled(false);
            
            
            groupP1 = new ButtonGroup();
            groupP1.add(lEttorP1);
            groupP1.add(lTvaorP1);
            groupP1.add(lTreorP1);
            groupP1.add(lFyrorP1);
            groupP1.add(lFemmorP1);
            groupP1.add(lSexorP1);
            groupP1.add(lParP1);
            groupP1.add(lTvaParP1);
            groupP1.add(lTrissP1);
            groupP1.add(lFyrtalP1);
            groupP1.add(lKakP1);
            groupP1.add(lLitenStegeP1);
            groupP1.add(lStorStegeP1);
            groupP1.add(lChansP1);
            groupP1.add(lYatzyP1);
            groupP1.add(unSelectedP1);
            
            west.add(pName1);		west.add(empty1);
            west.add(tEttorP1);      west.add(lEttorP1);
            west.add(tTvaorP1);      west.add(lTvaorP1);
            west.add(tTreorP1);      west.add(lTreorP1);
            west.add(tFyrorP1);      west.add(lFyrorP1);
            west.add(tFemmorP1);     west.add(lFemmorP1);
            west.add(tSexorP1);      west.add(lSexorP1);
            west.add(tBonusP1);      west.add(lBonus);
            west.add(tEmpty);        west.add(lEmpty);
            west.add(tParP1);        west.add(lParP1);
            west.add(tTvaParP1);     west.add(lTvaParP1);
            west.add(tTrissP1);      west.add(lTrissP1);
            west.add(tFyrtalP1);     west.add(lFyrtalP1);
            west.add(tKakP1);        west.add(lKakP1);
            west.add(tLitenStegeP1); west.add(lLitenStegeP1);
            west.add(tStorStegeP1);  west.add(lStorStegeP1);
            west.add(tChansP1);      west.add(lChansP1);
            west.add(tYatzyP1);      west.add(lYatzyP1);
            west.add(tTotalP1);      west.add(lTotalP1);
            
            cont.add(west, BorderLayout.WEST);
        }
        
        //##################### Build Center ####################################
        /**
         *Builds the center part of the game window.
         **/
        public void buildCenter()
        {
            center = new JPanel(new GridLayout(1,1,5,5));
            
            cont.add(center, BorderLayout.CENTER);
        }
        
        //##################### Build East ######################################
        /**
         *Builds the east part of the game window.
         **/
        public void buildEast()
        {
            east = new JPanel(new GridLayout(19,2, 5,5));
            
            JLabel empty1 = new JLabel("");
            JLabel pName2 = new JLabel(yatzy.getNameP2());
            tEttorP2 = new JTextField(2);		lEttorP2 = new JRadioButton("Ettor");
            tTvaorP2 = new JTextField(2);		lTvaorP2 = new JRadioButton("Tv�or");
            tTreorP2 = new JTextField(2);		lTreorP2 = new JRadioButton("Treor");
            tFyrorP2 = new JTextField(2);		lFyrorP2 = new JRadioButton("Fyror");
            tFemmorP2 = new JTextField(2);		lFemmorP2 = new JRadioButton("Femor");
            tSexorP2 = new JTextField(2);		lSexorP2 = new JRadioButton("Sexor");
            tBonusP2 = new JTextField(2);		JLabel lBonus = new JLabel("Bonus");
            JLabel tEmpty = new JLabel("");		JLabel lEmpty = new JLabel("");
            tParP2 = new JTextField(2);                 lParP2 = new JRadioButton("Par");
            tTvaParP2 = new JTextField(2);              lTvaParP2 = new JRadioButton("Tv� Par");
            tTrissP2 = new JTextField(2);               lTrissP2 = new JRadioButton("Triss");
            tFyrtalP2 = new JTextField(2);              lFyrtalP2 = new JRadioButton("Fyrtal");
            tKakP2 = new JTextField(2);                 lKakP2 = new JRadioButton("K�k");
            tLitenStegeP2 = new JTextField(2);          lLitenStegeP2 = new JRadioButton("Liten Stege");
            tStorStegeP2 = new JTextField(2);           lStorStegeP2 = new JRadioButton("Stor Stege");
            tChansP2 = new JTextField(2);               lChansP2 = new JRadioButton("Chans");
            tYatzyP2 = new JTextField(2);               lYatzyP2 = new JRadioButton("Yatzy");
            unSelectedP2 = new JRadioButton("Shouldnt see this");
            JLabel tEmpty2 = new JLabel("");		lTotalP2 = new JLabel("Total");
            tTotalP2 = new JTextField(2);
            
            tEttorP2.setEnabled(false);                 lEttorP2.setEnabled(false);
            tTvaorP2.setEnabled(false);                 lTvaorP2.setEnabled(false);
            tTreorP2.setEnabled(false);                 lTreorP2.setEnabled(false);
            tFyrorP2.setEnabled(false);                 lFyrorP2.setEnabled(false);
            tFemmorP2.setEnabled(false);                lFemmorP2.setEnabled(false);
            tSexorP2.setEnabled(false);                 lSexorP2.setEnabled(false);
            tBonusP2.setEnabled(false);                 lParP2.setEnabled(false);
            tParP2.setEnabled(false);                   lTvaParP2.setEnabled(false);
            tTvaParP2.setEnabled(false);                lTrissP2.setEnabled(false);
            tTrissP2.setEnabled(false);                 lFyrtalP2.setEnabled(false);
            tFyrtalP2.setEnabled(false);                lKakP2.setEnabled(false);
            tKakP2.setEnabled(false);                   lLitenStegeP2.setEnabled(false);
            tLitenStegeP2.setEnabled(false);            lStorStegeP2.setEnabled(false);
            tStorStegeP2.setEnabled(false);             lChansP2.setEnabled(false);
            tChansP2.setEnabled(false);                 lYatzyP2.setEnabled(false);
            tYatzyP2.setEnabled(false);
            tTotalP2.setEnabled(false);
            
            lEttorP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lEttorP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lTvaorP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lTvaorP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lTreorP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lTreorP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lFyrorP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lFyrorP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lFemmorP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lFemmorP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lSexorP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lSexorP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lBonus.setHorizontalTextPosition(SwingConstants.LEADING);
            lBonus.setHorizontalAlignment(SwingConstants.RIGHT);
            lParP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lParP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lTvaParP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lTvaParP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lTrissP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lTrissP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lFyrtalP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lFyrtalP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lKakP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lKakP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lLitenStegeP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lLitenStegeP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lStorStegeP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lStorStegeP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lChansP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lChansP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lYatzyP2.setHorizontalTextPosition(SwingConstants.LEADING);
            lYatzyP2.setHorizontalAlignment(SwingConstants.RIGHT);
            lTotalP2.setHorizontalAlignment(SwingConstants.RIGHT);
            
            ButtonGroup group;
            group = new ButtonGroup();
            group.add(lEttorP2);
            group.add(lTvaorP2);
            group.add(lTreorP2);
            group.add(lFyrorP2);
            group.add(lFemmorP2);
            group.add(lSexorP2);
            group.add(lParP2);
            group.add(lTvaParP2);
            group.add(lTrissP2);
            group.add(lFyrtalP2);
            group.add(lKakP2);
            group.add(lLitenStegeP2);
            group.add(lStorStegeP2);
            group.add(lChansP2);
            group.add(lYatzyP2);
            group.add(unSelectedP2);
            
            
            
            east.add(empty1);		east.add(pName2);
            east.add(lEttorP2);		east.add(tEttorP2);
            east.add(lTvaorP2);		east.add(tTvaorP2);
            east.add(lTreorP2);		east.add(tTreorP2);
            east.add(lFyrorP2);		east.add(tFyrorP2);
            east.add(lFemmorP2);	east.add(tFemmorP2);
            east.add(lSexorP2);		east.add(tSexorP2);
            east.add(lBonus);		east.add(tBonusP2);
            east.add(lEmpty);		east.add(tEmpty);
            east.add(lParP2);		east.add(tParP2);
            east.add(lTvaParP2);	east.add(tTvaParP2);
            east.add(lTrissP2);		east.add(tTrissP2);
            east.add(lFyrtalP2);	east.add(tFyrtalP2);
            east.add(lKakP2);		east.add(tKakP2);
            east.add(lLitenStegeP2);	east.add(tLitenStegeP2);
            east.add(lStorStegeP2);	east.add(tStorStegeP2);
            east.add(lChansP2);		east.add(tChansP2);
            east.add(lYatzyP2);		east.add(tYatzyP2);
            east.add(lTotalP2);	    east.add(tTotalP2);
            
            
            cont.add(east, BorderLayout.EAST);
        }
    }
    
    
    
    //################### CHECKBOXLISTENER ##########################
    /**
     *Class for creating objects to listen on JCheckBox'es
     **/
    public class CheckBoxListener implements ItemListener
    {
        public void itemStateChanged(ItemEvent e)
        {
            if(e.getItemSelectable() == o2)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    name2.setEnabled(true);
                    nrOfPlayers = 2;
                }
                else
                {
                    name2.setEnabled(false);
                    nrOfPlayers = 1;
                }
                
            }
            
            if(e.getItemSelectable() == hold1)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    yatzy.keepDice(1,0);
                }
                else
                {
                    yatzy.keepDice(0,0);
                }
            }
            
            if(e.getItemSelectable() == hold2)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    yatzy.keepDice(1,1);
                }
                else
                {
                    yatzy.keepDice(0,1);
                }
            }
            
            if(e.getItemSelectable() == hold3)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    yatzy.keepDice(1,2);
                }
                else
                {
                    yatzy.keepDice(0,2);
                }
            }
            
            if(e.getItemSelectable() == hold4)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    yatzy.keepDice(1,3);
                }
                else
                {
                    yatzy.keepDice(0,3);
                }
            }
            
            if(e.getItemSelectable() == hold5)
            {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    yatzy.keepDice(1,4);
                }
                else
                {
                    yatzy.keepDice(0,4);
                }
            }
            
            
        }
    }
    
    //################### BUTTONLISTENER #############################
    /**
     *Class to create objects that listen on Buttons
     **/
    public class ButtonListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            if(e.getActionCommand().equals("Cancel"))
            {
                System.exit(0);
            }
            else if(e.getActionCommand().equals("OK"))
            {
                okClicked();
            }
            else if(e.getActionCommand().equals("Klar"))
            {
                doneClicked();
            }
            else if(e.getActionCommand().equals("Kasta"))
            {
                rollClicked();
            }
            else if(e.getActionCommand().equals("Regler"))
            {
            	JOptionPane.showMessageDialog(null, "Ettor till sexor\n" +
            										"H�r placerar du de po�ng du inf�rskaffar genom idogt samlande\n" +
            										"av t�rningar av samma sort. F�r att erh�lla de 50 bonuspo�ng\n" +
            										"kr�vs att du f�r tre av varje eller en valfri kombination\n" +
            										"motsvarande 63 po�ng!\n\n" + 
            										
            										"Par\n"+
            										"Som namnet antyder f�r po�ng genom parbildning. Tex, 2 fyror\n\n" +
            										
            										"Tretal\n"+
            										"Lyckas du beskaffa dig med tre t�rningar av samma val�r har du en triss\n\n"+
            										
            										"Fyrtal\n"+
            										"Inf�rskaffas p� samma vis som tretalet, fast med kryddan\n"+ 
            										"att du beh�ver fyra av samma!\n\n"+ 
            										
            										"Tv�par\n"+
            										"H�r kr�vs att du har tv� olika par. Ej fyra av samma val�r!\n\n"+ 
            										
            										"K�k\n" +
            										"En k�k byggs av ett tretal och ett par.\n"+
            										"Tv� olika val�rer �r ett krav\n\n"+
            										
            										"Lilla Stegen\n" +
            										"H�r kr�vs t�rningarna ett till och med fem. Enkelt!\n\n"+
            										
            										"Stora Stegen\n"+
            										"H�r kr�vs samtliga val�rer mellan 2-6\n\n"+
            										
            										"Chans\n"+
            										"Summan av samtliga t�rningar\n\n"+
            										
            										"Yatzy\n"+
            										"H�r kr�vs det 5 av samma val�r\n\n"+
            										
            										"Strykning\n"+
            										"Om dina t�rningar ej har vad som kr�vs ovan,\n"+
            										"s� f�r du stryka n�got. Detta ger dig dock 0 po�ng\n");
            										
            											
            }
            else if(e.getActionCommand().equals("Hj�lp"))
            {
            	JOptionPane.showMessageDialog(null, "Yatzy Hj�lpen\n" + 
            										"Var spelare oavsett om du spelar sj�lv eller med en motst�ndare har vars 3 kast.\n"+
            										"Emellan varje kast kan spelaren v�lja att spara en eller flera t�rningar. Sparandet\n"+
            										"av t�rningar underl�ttar m�let att n� �nskat resultat. F�r att spara en t�rning klickar\n"+
            										"du p� rutan under den t�rningen du vill spara. Du kan spara allt fr�n 1 till 5 t�rningar.\n"+
            										"N�r du kryssat i rutan och ser att d�r finns en bock s� rullar du t�rningarna igen.\n"+
            										"N�r �nskat resultat �r n�tt eller om du helt enkelt har gjort dina 3 kast s� ska du nu\n"+
            										"best�mma dig f�r var du vill spara t�rningarna. Detta g�rs genom att klickar en g�ng p�\n"+
            										"respektive �plopp� som du vill spara dina t�rningar i. \n\nSist klickar du p� Klar knappen"+
            										"f�r att antingen l�mna �ver turen till n�sta spelare\n eller f�r att sj�lv p�b�rja n�sta omg�ng");
            }
            else if(e.getActionCommand().equals("Avsluta"))
            {
            	System.exit(0);
            }
        }
        
        
        
        //############BUTTONLISTENER METHODS ######################
        public void okClicked()
        {
        	//if(text)///////////////
            String tmpName1 = name1.getText();
            String tmpName2 = name2.getText();
            theGame = new GuiGame(tmpName1, tmpName2);
            theGame.setVisible(true);
            setVisible(false);
        }
        
        public void selectedFalse()
        {
            lEttorP1.setSelected(false);
        }
        
        public void doneClicked()
        {
            if (lEttorP1.isSelected())
            {
                yatzy.setEttorP1();
                tEttorP1.setText(Integer.toString(yatzy.getEttorP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getEttorP1()));
                bonusP1 = bonusP1 + yatzy.getEttorP1();
                lEttorP1.setEnabled(false);
                newRound();
            }
            else if (lEttorP2.isSelected())
            {
                yatzy.setEttorP2();
                tEttorP2.setText(Integer.toString(yatzy.getEttorP2()));
                lEttorP2.setEnabled(false);
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getEttorP2()));
                bonusP2 = bonusP2 + yatzy.getEttorP2();
                newRound();
            }
            else if (lTvaorP1.isSelected())
            {
                yatzy.setTvaorP1();
                tTvaorP1.setText(Integer.toString(yatzy.getTvaorP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getTvaorP1()));
                bonusP1 = bonusP1 + yatzy.getTvaorP1();
                lTvaorP1.setEnabled(false);
                newRound();
            }
            else if (lTvaorP2.isSelected())
            {
                yatzy.setTvaorP2();
                tTvaorP2.setText(Integer.toString(yatzy.getTvaorP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getTvaorP2()));
                bonusP2 = bonusP2 + yatzy.getTvaorP2();
                lTvaorP2.setEnabled(false);
                newRound();
            }
            else if (lTreorP1.isSelected())
            {
                yatzy.setTreorP1();
                tTreorP1.setText(Integer.toString(yatzy.getTreorP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getTreorP1()));
                bonusP1 = bonusP1 + yatzy.getTreorP1();
                lTreorP1.setEnabled(false);
                newRound();
            }
            else if (lTreorP2.isSelected())
            {
                yatzy.setTreorP2();
                tTreorP2.setText(Integer.toString(yatzy.getTreorP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getTreorP2()));
                bonusP2 = bonusP2 + yatzy.getTreorP2();
                lTreorP2.setEnabled(false);
                newRound();
            }
            else if (lFyrorP1.isSelected())
            {
                yatzy.setFyrorP1();
                tFyrorP1.setText(Integer.toString(yatzy.getFyrorP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getFyrorP1()));
                bonusP1 = bonusP1 + yatzy.getFyrorP1();
                lFyrorP1.setEnabled(false);
                newRound();
            }
            else if (lFyrorP2.isSelected())
            {
                yatzy.setFyrorP2();
                tFyrorP2.setText(Integer.toString(yatzy.getFyrorP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getFyrorP2()));
                bonusP2 = bonusP2 + yatzy.getFyrorP2();
                lFyrorP2.setEnabled(false);
                newRound();
            }
            else if (lFemmorP1.isSelected())
            {
                yatzy.setFemmorP1();
                tFemmorP1.setText(Integer.toString(yatzy.getFemmorP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getFemmorP1()));
                bonusP1 = bonusP1 + yatzy.getFemmorP1();
                lFemmorP1.setEnabled(false);
                newRound();
            }
            else if (lFemmorP2.isSelected())
            {
                yatzy.setFemmorP2();
                tFemmorP2.setText(Integer.toString(yatzy.getFemmorP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getFemmorP2()));
                bonusP2 = bonusP2 + yatzy.getFemmorP2();
                lFemmorP2.setEnabled(false);
                newRound();
            }
            else if (lSexorP1.isSelected())
            {
                yatzy.setSexorP1();
                tSexorP1.setText(Integer.toString(yatzy.getSexorP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getSexorP1()));
                bonusP1 = bonusP1 + yatzy.getSexorP1();
                lSexorP1.setEnabled(false);
                newRound();
            }
            else if (lSexorP2.isSelected())
            {
                yatzy.setSexorP2();
                tSexorP2.setText(Integer.toString(yatzy.getSexorP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getSexorP2()));
                bonusP2 = bonusP2 + yatzy.getSexorP2();
                lSexorP2.setEnabled(false);
                newRound();
            }
            else if (lParP1.isSelected())
            {
                yatzy.setParP1();
                tParP1.setText(Integer.toString(yatzy.getParP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getParP1()));
                lParP1.setEnabled(false);
                newRound();
            }
            else if (lParP2.isSelected())
            {
                yatzy.setParP2();
                tParP2.setText(Integer.toString(yatzy.getParP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getParP2()));
                lParP2.setEnabled(false);
                newRound();
            }
            else if (lTvaParP1.isSelected())
            {
                yatzy.setTvaparP1();
                tTvaParP1.setText(Integer.toString(yatzy.getTvaparP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getTvaparP1()));
                lTvaParP1.setEnabled(false);
                newRound();
            }
            else if (lTvaParP2.isSelected())
            {
                yatzy.setTvaparP2();
                tTvaParP2.setText(Integer.toString(yatzy.getTvaparP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getTvaparP2()));
                lTvaParP2.setEnabled(false);
                newRound();
            }
            else if (lTrissP1.isSelected())
            {
                yatzy.setTrissP1();
                tTrissP1.setText(Integer.toString(yatzy.getTrissP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getTrissP1()));
                lTrissP1.setEnabled(false);
                newRound();
            }
            else if (lTrissP2.isSelected())
            {
                yatzy.setTrissP2();
                tTrissP2.setText(Integer.toString(yatzy.getTrissP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getTrissP2()));
                lTrissP2.setEnabled(false);
                newRound();
            }
            else if (lFyrtalP1.isSelected())
            {
                yatzy.setFyrtalP1();
                tFyrtalP1.setText(Integer.toString(yatzy.getFyrtalP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getFyrtalP1()));
                lFyrtalP1.setEnabled(false);
                newRound();
            }
            else if (lFyrtalP2.isSelected())
            {
                yatzy.setFyrtalP2();
                tFyrtalP2.setText(Integer.toString(yatzy.getFyrtalP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getFyrtalP2()));
                lFyrtalP2.setEnabled(false);
                newRound();
            }
            else if (lKakP1.isSelected())
            {
                yatzy.setKakP1();
                tKakP1.setText(Integer.toString(yatzy.getKakP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getKakP1()));
                lKakP1.setEnabled(false);
                newRound();
            }
            else if (lKakP2.isSelected())
            {
                yatzy.setKakP2();
                tKakP2.setText(Integer.toString(yatzy.getKakP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getKakP2()));
                lKakP2.setEnabled(false);
                newRound();
            }
            else if (lChansP1.isSelected())
            {
                yatzy.setChansP1();
                tChansP1.setText(Integer.toString(yatzy.getChansP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getChansP1()));
                lChansP1.setEnabled(false);
                newRound();
            }
            else if (lChansP2.isSelected())
            {
                yatzy.setChansP2();
                tChansP2.setText(Integer.toString(yatzy.getChansP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getChansP2()));
                lChansP2.setEnabled(false);
                newRound();
            }
            
            else if (lYatzyP1.isSelected())
            {
                yatzy.setYatzyP1();
                tYatzyP1.setText(Integer.toString(yatzy.getYatzyP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getYatzyP1()));
                lYatzyP1.setEnabled(false);
                newRound();
            }
            else if (lYatzyP2.isSelected())
            {
                yatzy.setYatzyP2();
                tYatzyP2.setText(Integer.toString(yatzy.getYatzyP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getYatzyP2()));
                lYatzyP2.setEnabled(false);
                newRound();
            }
            else if (lLitenStegeP1.isSelected())
            {
                yatzy.setLitenStegeP1();
                tLitenStegeP1.setText(Integer.toString(yatzy.getLitenStegeP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getLitenStegeP1()));
                lLitenStegeP1.setEnabled(false);
                newRound();
            }
            else if (lLitenStegeP2.isSelected())
            {
                yatzy.setLitenStegeP2();
                tLitenStegeP2.setText(Integer.toString(yatzy.getLitenStegeP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getLitenStegeP2()));
                lLitenStegeP2.setEnabled(false);
                newRound();
            }
            else if (lStorStegeP1.isSelected())
            {
                yatzy.setStorStegeP1();
                tStorStegeP1.setText(Integer.toString(yatzy.getStorStegeP1()));
                tTotalP1.setText(Integer.toString(totalP1 = totalP1 + yatzy.getStorStegeP1()));
                lStorStegeP1.setEnabled(false);
                newRound();
            }
            else if (lStorStegeP2.isSelected())
            {
                yatzy.setStorStegeP2();
                tStorStegeP2.setText(Integer.toString(yatzy.getStorStegeP2()));
                tTotalP2.setText(Integer.toString(totalP2 = totalP2 + yatzy.getStorStegeP2()));
                lStorStegeP2.setEnabled(false);
                newRound();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You have to select a result!");
            }
            
            if(bonusP1 >= 63)
            {
                tBonusP1.setText(Integer.toString(50));
                totalP1 = totalP1 + 50;
                tTotalP1.setText(Integer.toString(totalP1));
                bonusP1 = 0;
            }
            
            if(bonusP2 >= 63)
            {
                tBonusP2.setText(Integer.toString(50));
                totalP2 = totalP2 + 50;
                tTotalP2.setText(Integer.toString(totalP2));
                bonusP2 = 0;
            }
            
        }
        
        
        public void newRound()
        {
            
            rounds++;
            if (nrOfPlayers != 2)
                rounds++;
            
            if(rounds ==30)
            {
                yatzy.setScore(yatzy.getNameP1(), tTotalP1.getText());
                yatzy.setScore(yatzy.getNameP2(), tTotalP2.getText());
                showScore();
                done.setEnabled(false);
                roll.setEnabled(false);
                hold1.setEnabled(false);
                hold2.setEnabled(false);
                hold3.setEnabled(false);
                hold4.setEnabled(false);
                hold5.setEnabled(false);
                
            }
            else
            {
                
                hold1.setSelected(false);
                hold2.setSelected(false);
                hold3.setSelected(false);
                hold4.setSelected(false);
                hold5.setSelected(false);
                
                dice1.setIcon(null);
                dice2.setIcon(null);
                dice3.setIcon(null);
                dice4.setIcon(null);
                dice5.setIcon(null);
                
                done.setEnabled(false);
                roll.setEnabled(true);
                
                if (nrOfPlayers == 2)
                {
                    changePlayer();
                }
                unSelectedP1.setSelected(true);
                unSelectedP2.setSelected(true);
                nrOfTosses = 0;
            }
        }
        
        public void showScore()
        {
            Vector result = yatzy.showScore();
            String finalResult = "";
            
            for(int i = 0;i<10;i++)
            {
                String tmpS = (String)result.get(i);
                StringTokenizer st = new StringTokenizer(tmpS, "#");
                
                finalResult = finalResult.concat(st.nextToken() + " " + st.nextToken() + "\n");
            }
            
            JOptionPane.showMessageDialog(null,"==== High Score ====\n\n" + finalResult);
        }
        
        
        public void rollClicked()
        {
            
            yatzy.tossDices();
            ImageIcon icon0 = new ImageIcon("DD" + Integer.toString(yatzy.getDiceValue(0)) + "D.gif");
            ImageIcon icon1 = new ImageIcon("DD" + Integer.toString(yatzy.getDiceValue(1)) + "D.gif");
            ImageIcon icon2 = new ImageIcon("DD" + Integer.toString(yatzy.getDiceValue(2)) + "D.gif");
            ImageIcon icon3 = new ImageIcon("DD" + Integer.toString(yatzy.getDiceValue(3)) + "D.gif");
            ImageIcon icon4 = new ImageIcon("DD" + Integer.toString(yatzy.getDiceValue(4)) + "D.gif");
            dice1.setIcon(icon0);
            dice2.setIcon(icon1);
            dice3.setIcon(icon2);
            dice4.setIcon(icon3);
            dice5.setIcon(icon4);
            nrOfTosses++;
            
            done.setEnabled(true);
            
            if(nrOfTosses == 3)
            {
                roll.setEnabled(false);
            }
        }
        
        public void changePlayer()
        {
            if(player == 1)
            {
                lEttorP2.setEnabled(false);
                lTvaorP2.setEnabled(false);
                lTreorP2.setEnabled(false);
                lFyrorP2.setEnabled(false);
                lFemmorP2.setEnabled(false);
                lSexorP2.setEnabled(false);
                lParP2.setEnabled(false);
                lTvaParP2.setEnabled(false);
                lTrissP2.setEnabled(false);
                lFyrtalP2.setEnabled(false);
                lKakP2.setEnabled(false);
                lLitenStegeP2.setEnabled(false);
                lStorStegeP2.setEnabled(false);
                lChansP2.setEnabled(false);
                lYatzyP2.setEnabled(false);
                
                if(tEttorP1.getText().equals(""))
                    lEttorP1.setEnabled(true);
                if(tTvaorP1.getText().equals(""))
                    lTvaorP1.setEnabled(true);
                if(tTreorP1.getText().equals(""))
                    lTreorP1.setEnabled(true);
                if(tFyrorP1.getText().equals(""))
                    lFyrorP1.setEnabled(true);
                if(tFemmorP1.getText().equals(""))
                    lFemmorP1.setEnabled(true);
                if(tSexorP1.getText().equals(""))
                    lSexorP1.setEnabled(true);
                if(tParP1.getText().equals(""))
                    lParP1.setEnabled(true);
                if(tTvaParP1.getText().equals(""))
                    lTvaParP1.setEnabled(true);
                if(tTrissP1.getText().equals(""))
                    lTrissP1.setEnabled(true);
                if(tFyrtalP1.getText().equals(""))
                    lFyrtalP1.setEnabled(true);
                if(tKakP1.getText().equals(""))
                    lKakP1.setEnabled(true);
                if(tLitenStegeP1.getText().equals(""))
                    lLitenStegeP1.setEnabled(true);
                if(tStorStegeP1.getText().equals(""))
                    lStorStegeP1.setEnabled(true);
                if(tChansP1.getText().equals(""))
                    lChansP1.setEnabled(true);
                if(tYatzyP1.getText().equals(""))
                    lYatzyP1.setEnabled(true);
                player = 2;
            }
            else if(player == 2)
            {
                if(tEttorP2.getText().equals(""))
                    lEttorP2.setEnabled(true);
                if(tTvaorP2.getText().equals(""))
                    lTvaorP2.setEnabled(true);
                if(tTreorP2.getText().equals(""))
                    lTreorP2.setEnabled(true);
                if(tFyrorP2.getText().equals(""))
                    lFyrorP2.setEnabled(true);
                if(tFemmorP2.getText().equals(""))
                    lFemmorP2.setEnabled(true);
                if(tSexorP2.getText().equals(""))
                    lSexorP2.setEnabled(true);
                if(tParP2.getText().equals(""))
                    lParP2.setEnabled(true);
                if(tTvaParP2.getText().equals(""))
                    lTvaParP2.setEnabled(true);
                if(tTrissP2.getText().equals(""))
                    lTrissP2.setEnabled(true);
                if(tFyrtalP2.getText().equals(""))
                    lFyrtalP2.setEnabled(true);
                if(tKakP2.getText().equals(""))
                    lKakP2.setEnabled(true);
                if(tLitenStegeP2.getText().equals(""))
                    lLitenStegeP2.setEnabled(true);
                if(tStorStegeP2.getText().equals(""))
                    lStorStegeP2.setEnabled(true);
                if(tChansP2.getText().equals(""))
                    lChansP2.setEnabled(true);
                if(tYatzyP2.getText().equals(""))
                    lYatzyP2.setEnabled(true);
                
                lEttorP1.setEnabled(false);
                lTvaorP1.setEnabled(false);
                lTreorP1.setEnabled(false);
                lFyrorP1.setEnabled(false);
                lFemmorP1.setEnabled(false);
                lSexorP1.setEnabled(false);
                lParP1.setEnabled(false);
                lTvaParP1.setEnabled(false);
                lTrissP1.setEnabled(false);
                lFyrtalP1.setEnabled(false);
                lKakP1.setEnabled(false);
                lLitenStegeP1.setEnabled(false);
                lStorStegeP1.setEnabled(false);
                lChansP1.setEnabled(false);
                lYatzyP1.setEnabled(false);
                
                
                player = 1;
            }
        }

   
    }
}