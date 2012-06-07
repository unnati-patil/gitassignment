public class Rajamantri extends Activity
{
  
    @Override
	public void onbackPressed()
    {
    }

    @Override
	protected void onPostResume() {
	// TODO Auto-generated method stub
	super.onPostResume();
    }

    @Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
    {
	AlertDialog dialog = new AlertDialog.Builder(this).create();
	dialog.setTitle("Exit game!");
	dialog.setMessage("Are you sure you want to exit the game?");
	dialog.setButton("Exit", new DialogInterface.OnClickListener()
	    {
		public void onClick(DialogInterface dialog, int which)
		{
		    finish();
		}
	    });
	dialog.setButton2("Cancel", new DialogInterface.OnClickListener()
	    {
		public void onClick(DialogInterface dialog, int which)
		{
		    dialog.dismiss();
		}
	    });
	dialog.show();
	return super.onKeyDown(keyCode, event);
    }

    @Override
	public void onLowMemory()
    {
	AlertDialog dialog = new AlertDialog.Builder(this).create();
	dialog.setTitle("Low memory!");
	dialog.setMessage("Too many apps open, kindly close some other apps and try again!");
	dialog.setButton("Exit", new DialogInterface.OnClickListener()
	    {
		public void onClick(DialogInterface dialog, int which)
		{
		    
		    finish();
	        }
	    });
	
	dialog.show();
	
	super.onLowMemory();
    }
    
    @Override
	protected void onPause()
    {
	// TODO Auto-generated method stub
	super.onPause();
    }
    
    String[] solutionArray = { "RAJA", "MANTRI", "CHOR", "SIPAHI"};
    String[] playersArray = {"player_one_", "player_two_", "player_three", "player_four"};
    static String player_one_name = "" ;
    static String player_two_name = "";
    static String player_three_name = "";
    static String player_four_name = "";
    static String player_one_role = "";
    static String player_two_role = "";
    static String player_three_role = "";
    static String player_four_role = "";
    static boolean guess = false;
    static String player_one_ = "";
    static String player_two_ = "";
    static String player_three = "";
    static String player_four = "";
    static int i=0,j=0,k=0,l=0;
    static int p_one_score = 0;
    static int p_two_score = 0;
    static int p_three_score = 0;
    static int p_four_score = 0;
    int count = 0;
    
    Button btnRajaMantri;
    Button btnHelp;
    //ImageView btn9;
    Button btnPlay;
    static Button btnPod_one;
    static Button btnPod_two;
    static Button btnPod_three;
    static Button btnPod_four;
    //Button btnShowResult;
    //Button btnRestart;
    Button btnSignin;
    //Button btnGuess;
    EditText editTxtPlayer_one;
    EditText editTxtPlayer_two;
    EditText editTxtPlayer_three;
    EditText editTxtPlayer_four;
    //EditText edt2;
    //EditText edt2;
    //EditText edt4;
    
    TextView lblPlayer_one;
    TextView lblPlayer_two;
    TextView lblPlayer_three;
    TextView lblPlayer_four;
    static TextView txtTurn;
    static TextView txtPlayer_one;
    static TextView txtPlayer_two;
    static TextView txtPlayer_three;
    static TextView txtPlayer_four;
    //Bundle savedInstanceState2;
    Button btnMainMenu;
    
    String nextTurn = "";
    
    public void onRestart()
    {
	
	super.onRestart();
	/*	player_one_name = "" ;
		player_two_name = "";
		player_three_name = "";
		player_four_name = "";
		guess = false;
		player_one_ = "";
		player_two_ = "";
		player_three = "";
		player_four = "";
		i=0;j=0;k=0;l=0;
		p_one_score = 0;
txtPlayer_one		p_two_score = 0;
		p_three_score = 0;
		p_four_score = 0;*/
	
  }
    
    public void onResume(){
	
	super.onResume();
	/*player_one_name = "" ;
	  player_two_name = "";
	  player_three_name = "";
	  player_four_name = "";
	  guess = false;
	  player_one_ = "";
	  player_two_ = "";
	  player_three = "";
	  player_four = "";
	  i=0;j=0;k=0;l=0;
	  p_one_score = 0;
	  p_two_score = 0;
	  p_three_score = 0;
	  p_four_score = 0;*/
    	
    }
    
    
    public void onCreate(Bundle savedInstanceState) 
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.welcome);
	
	i = 0;
	j = 0;
	k = 0;
	l = 0;
	btnHelp = (Button)findViewById(R.id.btnHelp);
	btnHelp.setOnClickListener(new OnClickListener()
	    {
		public void onClick(View v)
		{
		    setContentView(R.layout.help);
		    // Create the adView
		    AdView adView = new AdView(Rajamantri.this, AdSize.BANNER, "a14e156523d01de");
		    // Lookup your LinearLayout assuming it’s been given
		    // the attribute android:id="@+id/mainLayout"
		    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayoutHelp);
		    // Add the adView to it
		    layout.addView(adView);
		    // Initiate a generic request to load it with an ad
		    adView.loadAd(new AdRequest());
		    TextView txtHelp = (TextView)findViewById(R.id.txtHelp);
		    String text = "Welcome to nostalgia! This is the paper free version of Raja Mantri Chor Sipahi.\n\nThe game involves bluffing with facial expressions and gtxtPlayer1ood guessing. This is a very popular childhood game in India played among kids often during their long summer vacations.\n\nThe game has 4 paper chits with Chor (thief), Sipahi (police), Raja (king) and Mantri (minister). The chits are folded at the start of the game and one of the 4 players will press SHUFFLE each one of the four players is supposed to secretly (by taking the phone and not letting the others see it)pick one chit by clicking on it, the player then clicks on the chit again to fold it back. All the players will then secretly open their chits and read what they have got. \n\nThe player who gets the chit with Raja written on it will say MERA MANTRI KAUN? (Who is my minister?). The player who got the chit with Mantri will say MEIN! (Me), The player with Raja will then say CHOR SIPAHI KA PATA LAGAO (find out who is the theif and who is the soldier). The player with Mantri will then guess who is the Chor (Thief), if he is wrong then his points are deducted and if he is correct he gets more points and the points from the player who got Chor (Thief) are deducted.\n\nIf the guess is correct the player with Chor is wrapped on his wrist by the Mantri, and if the Mantri is wrong then the Chor gets to hit his wrist.";
		    txtHelp.setText(text);
		    Button btnBack = (Button)findViewById(R.id.btnMainMenuHelp);
		    btnBack.setOnClickListener(new OnClickListener() {
			    
			    public void onClick(View v)
          {
	      Intent i = new Intent(Rajamantri.this, Rajamantri.class);
	      Rajamantri.this.startActivity(i);
	      finish();
	  }
			});
		}
	    });
        btnRajaMantri = (Button) findViewById(R.id.btnRajaMantri);
        btnRajaMantri.setOnClickListener(new OnClickListener() 
	    {
		public void onClick(View v)
		{
		    // TODO Auto-generated method stub
		    setContentView(R.layout.rmcsp);	
		    // Create the adView
		    AdView adView = new AdView(Rajamantri.this, AdSize.BANNER, "a14e156523d01de");
		    // Lookup your LinearLayout assuming it’s been given
		    // the attribute android:id="@+id/mainLayout"
		    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayoutPlayer);
		    // Add the adView to it
		    layout.addView(adView);
		    // Initiate a generic request to load it with an ad
		    adView.loadAd(new AdRequest());
		    
           editTxtPlayer_one = (EditText) findViewById(R.id.editTxtPlayer_one);
 	   editTxtPlayer_two = (EditText)findViewById(R.id.editTxtPlayer_two);
           editTxtPlayer_three = (EditText)findViewById(R.id.editTxtPlayer_three);
           editTxtPlayer_four = (EditText)findViewById(R.id.editTxtPlayer_four);
	   
           lblPlayer_one = (TextView) findViewById(R.id.lblPlayer_one);
           lblPlayer_two = (TextView) findViewById(R.id.lblPlayer_two);
           lblPlayer_three = (TextView) findViewById(R.id.lblPlayer_three);
           lblPlayer_four = (TextView) findViewById(R.id.lblPlayer_four);
 		
           Display display = getWindowManager().getDefaultDisplay(); 
           int width = display.getWidth();
           int height = display.getHeight();
	  
           lblPlayer_one.setGravity(Gravity.CENTER_HORIZONTAL);
           lblPlayer_two.setGravity(Gravity.CENTER_HORIZONTAL);
           lblPlayer_three.setGravity(Gravity.CENTER_HORIZONTAL);
           lblPlayer_four.setGravity(Gravity.CENTER_HORIZONTAL);
	 
           Log.v("AkandBakar", "Playernames:" + player_one_name);
           Log.v("AkandBakar", "Playernames:" + player_two_name);
           Log.v("AkandBakar", "Playernames:" + player_three_name);
           Log.v("AkandBakar", "Playernames:" + player_four_name);
           
           btnMainMenu = (Button) findViewById(R.id.btnMainMenu);
           btnMainMenu.setOnClickListener(new OnClickListener()
	       {
		   public void onClick(View v)
		   {
		       Intent i = new Intent(Rajamantri.this, Rajamantri.class);
		       Rajamantri.this.startActivity(i);
		       finish();
		   }
	       });
	   
	   btnSignin = (Button) findViewById(R.id.btnsignin);
	   btnSignin.setOnClickListener(new OnClickListener()
	       {
		   public void onClick(View v)
		   {
		       // TODO Auto-generated method stub
		       player_one_name = editTxtPlayer_one.getText().toString();
		       player_two_name = editTxtPlayer_two.getText().toString();
		       player_three_name = editTxtPlayer_three.getText().toString();
		       player_four_name = editTxtPlayer_four.getText().toString();
		       
		       if(player_one_name.equals("")||player_two_name.equals("")||player_three_name.equals("")||player_four_name.equals(""))
			   {
			       Toast toast = Toast.makeText(getBaseContext(), "Enter player names!", 8000);
			       toast.show();
			       
			   }
		       else
              {
		  setContentView(R.layout.rmcsgnew);	
		  // Create the adView
		  AdView adView = new AdView(Rajamantri.this, AdSize.BANNER, "a14e156523d01de");
		// Lookup your LinearLayout assuming it’s been given
		// the attribute android:id="@+id/mainLayout"
		  LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayout);
		  // Add the adView to it
		  layout.addView(adView);
		  // Initiate a generic request to load it with an ad
		  adView.loadAd(new AdRequest());
		  
		  txtTurn = (TextView)findViewById(R.id.txtTurn);
		  txtTurn.setText("Click on SHUFFLE!");
                playersArray[0] = player_one_name;
                playersArray[1] = player_two_name;
                playersArray[2] = player_three_name;
                playersArray[3] = player_four_name;
		
                txtPlayer_one = (TextView) findViewById(R.id.txtPlayer_one);
                txtPlayer_one.setText("1."+player_one_name + " [" + p_one_score + "]");
		
                txtPlayer_two = (TextView) findViewById(R.id.txtPlayer_two);
                txtPlayer_two.setText("2."+player_two_name+ " [" + p_two_score + "]");
		
                txtPlayer_three = (TextView) findViewById(R.id.txtPlayer_three);
                txtPlayer_three.setText("3."+player_three_name+ " [" + p_three_score + "]");
                txtPlayer_four = (TextView) findViewById(R.id.txtPlayer_four);
                txtPlayer_four.setText("4."+player_four_name+ " [" + p_four_score + "]");
		
                btnPlay = (Button) findViewById(R.id.btnPlay);
                btnPlay.setOnClickListener(new OnClickListener()
		    {
			public void onClick(View v)
			{
			    // TODO Auto-generated method stub
			    if(btnPlay.getText().equals("SHUFFLE"))
				{
				    Rajamantri.this.shuffle();
				}
                     else
			 {
			     Rajamantri.this.makeGuess();
			     Log.v("Rajamantri", "########## Player Name:" + player_one_name +" Role:" + player_one_role);
			     Log.v("Rajamantri", "########## Player Name:" + player_two_name +" Role:" + player_two_role);
			     Log.v("Rajamantri", "########## Player Name:" + player_three_name +" Role:" + player_three_role);
			     Log.v("Rajamantri", "########## Player Name:" + player_four_name +" Role:" + player_four_role);
			 }
						
			}
		    });
	      }
		   }
	       });
	}
	    });
 	
	
    }
   
    public void makeGuess(){
	
	btnPlay.setText("SHUFFLE");
    count = 0;
    btnPlay.setText("SHUFFLE");
    btnPod_one.setClickable(true);
    btnPod_two.setClickable(true);
    btnPod_three.setClickable(true);
    btnPod_four.setClickable(true);
    
   if(player_one_.equals("RAJA"))
       {
	   btnPod_one.setText("RAJA");
	   btnPod_one.setBackgroundResource(R.drawable.podopen);
	   btnPod_one.setClickable(false);
       }
   if(player_two_.equals("RAJA")){
			
       btnPod_two.setText("RAJA");
       btnPod_two.setBackgroundResource(R.drawable.podopen);
       btnPod_two.setClickable(false);
		}
   if(player_three.equals("RAJA")){
       
       btnPod_three.setText("RAJA");
			btnPod_three.setBackgroundResource(R.drawable.podopen);
			btnPod_three.setClickable(false);
   }
   if(player_four.equals("RAJA")){
       
       btnPod_four.setText("RAJA");
			btnPod_four.setBackgroundResource(R.drawable.podopen);
			btnPod_four.setClickable(false);
   }

   if(player_one_.equals("MANTRI")){
       
       btnPod_one.setText("MANTRI");
			btnPod_one.setBackgroundResource(R.drawable.podopen);
			btnPod_one.setClickable(false);
   }
   if(player_two_.equals("MANTRI")){
       
       btnPod_two.setText("MANTRI");
			btnPod_two.setBackgroundResource(R.drawable.podopen);
			btnPod_two.setClickable(false);
   }
		if(player_three.equals("MANTRI")){
		    
		    btnPod_three.setText("MANTRI");
		    btnPod_three.setBackgroundResource(R.drawable.podopen);
		    btnPod_three.setClickable(false);
		}
		if(player_four.equals("MANTRI")){
		    
		    btnPod_four.setText("MANTRI");
		    btnPod_four.setBackgroundResource(R.drawable.podopen);
			btnPod_four.setClickable(false);
			
		}
		
		if(player_one_role.equals("MANTRI")){
		    txtTurn.setText(player_one_name + " will find the CHOR!");
		}
		if(player_two_role.equals("MANTRI")){
		    txtTurn.setText(player_two_name + " will find the CHOR!");
		}
		if(player_three_role.equals("MANTRI")){
			txtTurn.setText(player_three_name + " will find the CHOR!");
		}
		if(player_four_role.equals("MANTRI")){
		    txtTurn.setText(player_four_name + " will find the CHOR!");
		}
		
		Log.v("AkhandBakar","#########" + btnPod_one.getText());
		
		if(btnPod_one.getText().equals("")){
		    
		    btnPod_one.setOnClickListener(new OnClickListener() {
				
			    
			    public void onClick(View v) {
				// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player_one_);
					if(player_one_.equals("CHOR")){
					    
						Rajamantri.guess = true;
						btnPod_one.setBackgroundResource(R.drawable.podopen);
						btnPod_one.setText("CHOR");
						
					}else{
					    
					    Rajamantri.guess = false;
					    btnPod_one.setBackgroundResource(R.drawable.podopen);
					    btnPod_one.setText("SIPAHI");
					}
					btnPod_one.setClickable(false);
					btnPod_two.setClickable(false);
					btnPod_three.setClickable(false);
					btnPod_four.setClickable(false);
					updateScore();
			    }
			});
		}	
		
		
		Log.v("AkhandBakar","#########" + btnPod_two.getText());
		if(btnPod_two.getText().equals("")){
		    
		    btnPod_two.setOnClickListener(new OnClickListener() {
			    
			    public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.v("AkhandBakar","#########" + player_two_);
				if(player_two_.equals("CHOR")){
				    
				    Rajamantri.guess = true;
				    btnPod_two.setBackgroundResource(R.drawable.podopen);
				    btnPod_two.setText("CHOR");
				}else{
				    
				    Rajamantri.guess = false;
				    btnPod_two.setBackgroundResource(R.drawable.podopen);
				    btnPod_two.setText("SIPAHI");
				    
				}
				btnPod_one.setClickable(false);
				btnPod_two.setClickable(false);
				btnPod_three.setClickable(false);
				btnPod_four.setClickable(false);
				updateScore();
			    }
			});
		}	
		
		Log.v("AkhandBakar","#########" + btnPod_three.getText());
		if(btnPod_three.getText().equals("")){
		    
		    btnPod_three.setOnClickListener(new OnClickListener() {
			    
				
			    public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.v("AkhandBakar","#########" + player_three);
				if(player_three.equals("CHOR")){
				    
				    Rajamantri.guess = true;
				    btnPod_three.setBackgroundResource(R.drawable.podopen);
				    btnPod_three.setText("CHOR");
				}else{
				    
				    Rajamantri.guess = false;
				    btnPod_three.setBackgroundResource(R.drawable.podopen);
				    btnPod_three.setText("SIPAHI");
				    
				}
				btnPod_one.setClickable(false);
				btnPod_two.setClickable(false);
				btnPod_three.setClickable(false);
				btnPod_four.setClickable(false);
				updateScore();
			    }
			});
		}
		
		
		Log.v("AkhandBakar","#########" + btnPod_four.getText());
		if(btnPod_four.getText().equals("")){
		    
		    btnPod_four.setOnClickListener(new OnClickListener() {
			    
			    
			    public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.v("AkhandBakar","#########" + player_four);
				if(player_four.equals("CHOR")){
				    
						Rajamantri.guess = true;
						btnPod_four.setBackgroundResource(R.drawable.podopen);
						btnPod_four.setText("CHOR");
				}else{
				    
				    Rajamantri.guess = false;
				    btnPod_four.setBackgroundResource(R.drawable.podopen);
				    btnPod_four.setText("SIPAHI");
				    
				}
				btnPod_one.setClickable(false);
				btnPod_two.setClickable(false);
				btnPod_three.setClickable(false);
				btnPod_four.setClickable(false);
				updateScore();
			    }
			});
		}
		
    }
    
    
    public void shuffle(){
	
    	btnPlay.setText("Guess");
	btnPlay.setClickable(false);
	shuffleArray(solutionArray);
	txtTurn.setText(player_one_name + "'s" + " turn!");
	nextTurn = player_two_name;
	btnPod_one = (Button)findViewById(R.id.btnPod_one);
	btnPod_one.setBackgroundResource(R.drawable.podtlclosed);
	btnPod_one.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
		    // TODO Auto-generated method stub
		    player_one_ = solutionArray[0];
		    btnPod_one.setText(player_one_);
		    btnPod_one.setBackgroundResource(R.drawable.podopen);
		    btnPod_two.setClickable(false);
		    btnPod_three.setClickable(false);
		    btnPod_four.setClickable(false);
		    if(txtTurn.getText().equals(player_one_name + "'s" + " turn!")){
						
			if(player_one_.equals("MANTRI")){
			    
			    player_one_role = "MANTRI";
			}
			if(player_one_.equals("RAJA")){
			    
			    player_one_role = "RAJA";
			}
			if(player_one_.equals("SIPAHI")){
			    
			    player_one_role = "SIPAHI";
			}
			if(player_one_.equals("CHOR")){
			    
			    player_one_role = "CHOR";
			}
			
			
			nextTurn = player_two_name + "'s" + " turn!";
			
		    }
		    if(txtTurn.getText().equals(player_two_name + "'s" + " turn!")){
			
			if(player_one_.equals("MANTRI")){
			    
			    player_two_role = "MANTRI";
			}
			if(player_one_.equals("RAJA")){
			    
			    player_two_role = "RAJA";
			}
			if(player_one_.equals("SIPAHI")){
			    
			    player_two_role = "SIPAHI";
			}
			if(player_one_.equals("CHOR")){
			    
			    player_two_role = "CHOR";
			}
			
			nextTurn = player_three_name + "'s" + " turn!";
			
		    }
		    if(txtTurn.getText().equals(player_three_name + "'s" + " turn!")){
			
			if(player_one_.equals("MANTRI")){
			    
			    player_three_role = "MANTRI";
			}
			if(player_one_.equals("RAJA")){
			    
			    player_three_role = "RAJA";
			}
			if(player_one_.equals("SIPAHI")){

			    player_three_role = "SIPAHI";
			}
			if(player_one_.equals("CHOR")){
			    
			    player_three_role = "CHOR";
			}
				    	
			nextTurn = player_four_name + "'s" + " turn!";
			
		    }
		    
		    if(txtTurn.getText().equals(player_four_name + "'s" + " turn!")){
			
			if(player_one_.equals("MANTRI")){
			    
			    player_four_role = "MANTRI";
			}
			if(player_one_.equals("RAJA")){
			    
			    player_four_role = "RAJA";
						}
			if(player_one_.equals("SIPAHI")){
			    
			    player_four_role = "SIPAHI";
			}
			if(player_one_.equals("CHOR")){
			    
			    player_four_role = "CHOR";
			}
			
			
			nextTurn = "Click on Guess!";
			
		    }
		    
		    txtTurn.setText("Click again to close the chit!");
		    
		    
		    
		    btnPod_one.setOnClickListener(new OnClickListener() {
			    
			    public void onClick(View v) {
				// TODO Auto-generated method stub
				btnPod_one.setClickable(false);
				count++;
				btnPod_one.setText("");
				btnPod_one.setBackgroundResource(R.drawable.podtlhalf);
				txtTurn.setText(nextTurn);
				btnPod_two.setClickable(true);
				btnPod_three.setClickable(true);
				btnPod_four.setClickable(true);
				if(count == 4){
				    
				    txtTurn.setText("Click on Guess!");
				    btnPlay.setClickable(true);
				    count = 0;
				    
				}
			    }
			});
		}
	    });
	
	btnPod_two = (Button)findViewById(R.id.btnPod_two);
	btnPod_two.setBackgroundResource(R.drawable.podtrclosed);
	btnPod_two.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
		    // TODO Auto-generated method stub
		    player_two_ = solutionArray[1];
		    btnPod_two.setText(player_two_);
		    btnPod_two.setBackgroundResource(R.drawable.podopen);
		    btnPod_one.setClickable(false);
		    btnPod_three.setClickable(false);
		    btnPod_four.setClickable(false);
		    if(txtTurn.getText().equals(player_one_name + "'s" + " turn!")){
			
			if(player_two_.equals("MANTRI")){
			    
			    player_one_role = "MANTRI";
			}
			if(player_two_.equals("RAJA")){
			    
			    player_one_role = "RAJA";
			}
			if(player_two_.equals("SIPAHI")){
			    
			    player_one_role = "SIPAHI";
			}
			if(player_two_.equals("CHOR")){
			    
			    player_one_role = "CHOR";
			}
			
			nextTurn = player_two_name+ "'s" + " turn!";
			
		    }
		    if(txtTurn.getText().equals(player_two_name + "'s" + " turn!")){
			
			if(player_two_.equals("MANTRI")){
			    
			    player_two_role = "MANTRI";
			}
			if(player_two_.equals("RAJA")){
			    
			    player_two_role = "RAJA";
			}
			if(player_two_.equals("SIPAHI")){
			    
			    player_two_role = "SIPAHI";
			}
			if(player_two_.equals("CHOR")){
								
			    player_two_role = "CHOR";
			}
			
			nextTurn = player_three_name+ "'s" + " turn!";
			
		    }
		    if(txtTurn.getText().equals(player_three_name + "'s" + " turn!")){
			
							if(player_two_.equals("MANTRI")){
							    
							    player_three_role = "MANTRI";
							}
							if(player_two_.equals("RAJA")){
							    
							    player_three_role = "RAJA";
							}
							if(player_two_.equals("SIPAHI")){
							    
							    player_three_role = "SIPAHI";
							}
							if(player_two_.equals("CHOR")){
								
							    player_three_role = "CHOR";
							}
							
							nextTurn = player_four_name+ "'s" + " turn!";
							
		    }
						if(txtTurn.getText().equals(player_four_name + "'s" + " turn!")){
						    
						    if(player_two_.equals("MANTRI")){
							
							player_four_role = "MANTRI";
						    }
						    if(player_two_.equals("RAJA")){
							
							player_four_role = "RAJA";
						    }
						    if(player_two_.equals("SIPAHI")){
							
							player_four_role = "SIPAHI";
							}
						    if(player_two_.equals("CHOR")){
							
							player_four_role = "CHOR";
						    }
						    
						    nextTurn = "Click on Guess!";
						    
						}
						txtTurn.setText("Click again to close the chit!");
						btnPod_two.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
							    // TODO Auto-generated method stub
							    btnPod_two.setClickable(false);
							    count++;
								btnPod_two.setText("");
								btnPod_two.setBackgroundResource(R.drawable.podtrhalf);
								txtTurn.setText(nextTurn);
								btnPod_one.setClickable(true);
								btnPod_three.setClickable(true);
								btnPod_four.setClickable(true);
								if(count == 4){
								    
								    txtTurn.setText("Click on Guess!");
								    btnPlay.setClickable(true);
									count = 0;
									
								}
							}
						    });
		}
				});
	
	
	btnPod_three = (Button)findViewById(R.id.btnPod_three);
	btnPod_three.setBackgroundResource(R.drawable.podblclosed);
	btnPod_three.setOnClickListener(new OnClickListener() {
		
					public void onClick(View v) {
					    // TODO Auto-generated method stub
					    player_three = solutionArray[2];
					    btnPod_three.setText(player_three);
					    btnPod_three.setBackgroundResource(R.drawable.podopen);
					    
						btnPod_two.setClickable(false);
						btnPod_one.setClickable(false);
						btnPod_four.setClickable(false);
						if(txtTurn.getText().equals(player_one_name + "'s" + " turn!")){
							
						    if(player_three.equals("MANTRI")){
							
							player_one_role = "MANTRI";
						    }
							if(player_three.equals("RAJA")){
							    
							    player_one_role = "RAJA";
							}
							if(player_three.equals("SIPAHI")){
							    
								player_one_role = "SIPAHI";
							}
							if(player_three.equals("CHOR")){
							    
								player_one_role = "CHOR";
							}
							
							nextTurn = player_two_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player_two_name + "'s" + " turn!")){
						    
						    if(player_three.equals("MANTRI")){
							
							player_two_role = "MANTRI";
							}
						    if(player_three.equals("RAJA")){
							
							player_two_role = "RAJA";
							}
						    if(player_three.equals("SIPAHI")){
							
							player_two_role = "SIPAHI";
						    }
							if(player_three.equals("CHOR")){
							    
							    player_two_role = "CHOR";
							}
							
							nextTurn = player_three_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player_three_name + "'s" + " turn!")){
						    
						    if(player_three.equals("MANTRI")){
								
							player_three_role = "MANTRI";
						    }
						    if(player_three.equals("RAJA")){
								
							player_three_role = "RAJA";
						    }
						    if(player_three.equals("SIPAHI")){
							
							player_three_role = "SIPAHI";
							}
						    if(player_three.equals("CHOR")){
							
							player_three_role = "CHOR";
						    }
							nextTurn = player_four_name+ "'s" + " turn!";
							
						}
						if(txtTurn.getText().equals(player_four_name + "'s" + " turn!")){
						    
							if(player_three.equals("MANTRI")){
							    
							    player_four_role = "MANTRI";
							}
							if(player_three.equals("RAJA")){
								
							    player_four_role = "RAJA";
							}
							if(player_three.equals("SIPAHI")){

							    player_four_role = "SIPAHI";
							}
							if(player_three.equals("CHOR")){
								
							    player_four_role = "CHOR";
							}
							nextTurn = "Click on Guess!";
							
						}
						
						txtTurn.setText("Click again to close the chit!");
						btnPod_three.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
							    // TODO Auto-generated method stub
							    btnPod_three.setClickable(false);
							    count++;
							    btnPod_three.setText("");
							    btnPod_three.setBackgroundResource(R.drawable.podblhalf);
							    txtTurn.setText(nextTurn);
							    btnPod_two.setClickable(true);
							    btnPod_one.setClickable(true);
							    btnPod_four.setClickable(true);
							    if(count == 4){
								
								txtTurn.setText("Click on Guess!");
								btnPlay.setClickable(true);
								count = 0;
								
							    }
							}
						    });
					}
	    });
	
	
	
	
	btnPod_four = (Button)findViewById(R.id.btnPod_four);
	btnPod_four.setBackgroundResource(R.drawable.podbrclosed);
	
	btnPod_four.setOnClickListener(new OnClickListener() {
		
					public void onClick(View v) {
					    // TODO Auto-generated method stub
					    player_four = solutionArray[3];
					    btnPod_four.setText(player_four);
					    btnPod_four.setBackgroundResource(R.drawable.podopen);
					    

					    btnPod_two.setClickable(false);
					    btnPod_three.setClickable(false);
					    btnPod_one.setClickable(false);
					    if(txtTurn.getText().equals(player_one_name + "'s" + " turn!")){
						
						if(player_four.equals("MANTRI")){
						    
								player_one_role = "MANTRI";
						}
						if(player_four.equals("RAJA")){
						    
						    player_one_role = "RAJA";
							}
						if(player_four.equals("SIPAHI")){
						    
						    player_one_role = "SIPAHI";
						}
						if(player_four.equals("CHOR")){
						    
						    player_one_role = "CHOR";
						}
							nextTurn = player_two_name+ "'s" + " turn!";
							
					    }
					    if(txtTurn.getText().equals(player_two_name + "'s" + " turn!")){
						
						if(player_four.equals("MANTRI")){
						    
								player_two_role = "MANTRI";
						}
						if(player_four.equals("RAJA")){
						    
						    player_two_role = "RAJA";
							}
						if(player_four.equals("SIPAHI")){
						    
						    player_two_role = "SIPAHI";
						}
						if(player_four.equals("CHOR")){
						    
						    player_two_role = "CHOR";
						}
						nextTurn = player_three_name+ "'s" + " turn!";
						
						}
					    if(txtTurn.getText().equals(player_three_name + "'s" + " turn!")){
						
						if(player_four.equals("MANTRI")){
						    
								player_three_role = "MANTRI";
						}
						if(player_four.equals("RAJA")){
						    
								player_three_role = "RAJA";
						}
						if(player_four.equals("SIPAHI")){
						    
								player_three_role = "SIPAHI";
						}
						if(player_four.equals("CHOR")){
						    
						    player_three_role = "CHOR";
						}
							nextTurn = player_four_name+ "'s" + " turn!";
							
					    }
					    if(txtTurn.getText().equals(player_four_name + "'s" + " turn!")){
						
							if(player_four.equals("MANTRI")){
							    
							    player_four_role = "MANTRI";
							}
							if(player_four.equals("RAJA")){
							    
							    player_four_role = "RAJA";
							}
							if(player_four.equals("SIPAHI")){
							    
							    player_four_role = "SIPAHI";
							}
							if(player_four.equals("CHOR")){
							    
							    player_four_role = "CHOR";
							}
							nextTurn = "Click on Guess!";
							
						}
					    
					    txtTurn.setText("Click again to close the chit!");
					    btnPod_four.setOnClickListener(new OnClickListener() {
						    
						    public void onClick(View v) {
							// TODO Auto-generated method stub
							btnPod_four.setClickable(false);
							count++;
							btnPod_four.setText("");
							btnPod_four.setBackgroundResource(R.drawable.podbrhalf);
							txtTurn.setText(nextTurn);
							btnPod_two.setClickable(true);
							btnPod_three.setClickable(true);
							btnPod_one.setClickable(true);
							if(count == 4){
							    
							    txtTurn.setText(nextTurn);
							    btnPlay.setClickable(true);
							    count = 0;
							    
							}
						    }
						});
					}
	    });    
	
	btnPod_one.setText("");
	btnPod_two.setText("");
	btnPod_three.setText("");
	btnPod_four.setText("");
    	
    	
    }
    
    public void setRole(String role, String player){
	
    	if(player_one_.equals("MANTRI")){
	    
	    player_four_role = "MANTRI";
	}
	if(player_one_.equals("RAJA")){
	    
	    player_four_role = "RAJA";
	}
	if(player_one_.equals("SIPAHI")){
	    
	    player_four_role = "SIPAHI";
	}
	if(player_one_.equals("CHOR")){
	    
	    player_four_role = "CHOR";
	}
    	
    	
    } 
    
    void shuffleArray(String[] solutionArray)
    {
    	Random rnd = new Random();
    	for (int i = solutionArray.length - 1; i >= 0; i--)
	    {
		int index = rnd.nextInt(i + 1);
		
		String a = solutionArray[index];
		solutionArray[index] = solutionArray[i];
		solutionArray[i] = a;
	    }
    }
    
    static void updateScore(){
	
    	Log.v("AkhandBakar", "##########"+ guess);
    	if(player_one_role.equals("MANTRI"))
	    {
    		Log.v("AkhandBakar", "##########Mantri"+ player_one_name);
    	if(guess)
	    {
    		i = i+80;
    		p_one_score=i;
    		txtTurn.setText(player_one_name+" is right!");
    		btnPod_one.setText(player_one_);
			btnPod_two.setText(player_two_);
			btnPod_three.setText(player_three);
			btnPod_four.setText(player_four);
			btnPod_one.setBackgroundResource(R.drawable.podopen);
			btnPod_two.setBackgroundResource(R.drawable.podopen);
			btnPod_three.setBackgroundResource(R.drawable.podopen);
			btnPod_four.setBackgroundResource(R.drawable.podopen);
			if(player_two_role.equals("CHOR"))
			    {
				p_two_score=j;
				if(player_three_role.equals("RAJA")){
				    
				    k = k+100;
    				l = l+50;
    				p_three_score=k;
    				p_four_score=l;
				}else{
				    
				    l = l+100;
				    k = k+50;
    				p_four_score=l;
    				p_three_score=k;
				}
			    }
			if(player_three_role.equals("CHOR"))
			    {
    			
				p_three_score=k;
				
				
				if(player_two_role.equals("RAJA")){
    				
				    j = j+100;
				    l = l+50;
				    p_two_score=j;
				    p_four_score=l;
    			}else{
				    
				    l = l+100;
				    j = j+50;
    				p_four_score=l;
    				p_two_score=j;
				}
			    }
			if(player_four_role.equals("CHOR"))
    			{
			    
			    p_four_score=l;
    			
			    if(player_three_role.equals("RAJA")){
    				
    				k = k+100;
    				j = j+50;
    				p_two_score=j;
    				p_three_score=k;
			    }else{
    				
    				j = j+100;
    				k = k+50;
    				p_three_score=k;
    				p_two_score=j;
			    }
    			}
    		}
    	else
	    {
    		i=i-80;
    		p_one_score = i;
    		txtTurn.setText(player_one_name+" is wrong!");
    		btnPod_one.setText(player_one_);
			btnPod_two.setText(player_two_);
			btnPod_three.setText(player_three);
			btnPod_four.setText(player_four);
			btnPod_one.setBackgroundResource(R.drawable.podopen);
			btnPod_two.setBackgroundResource(R.drawable.podopen);
			btnPod_three.setBackgroundResource(R.drawable.podopen);
			btnPod_four.setBackgroundResource(R.drawable.podopen);
			if(player_two_role.equals("CHOR"))
			    {
				j = j+25;
			p_two_score=j;
			if(player_three_role.equals("RAJA")){
			    
				k = k+100;
				l = l+50;
				p_three_score=k;
				p_four_score=l;
			}else{
			    
			    l = l+100;
			    k = k+50;
			    p_four_score=l;
			    p_three_score=k;
			}
			}
			if(player_three_role.equals("CHOR"))
			    {
			k=k+25;
			p_three_score=k;
			
			
			if(player_two_role.equals("RAJA")){
			    
			    j = j+100;
			    l = l+50;
			    p_two_score=j;
			    p_four_score=l;
			}else{
				
			    l = l+100;
			    j = j+50;
			    p_four_score=l;
			    p_two_score=j;
			}
			    }
			if(player_four_role.equals("CHOR"))
			    {
				l=l+25;
				p_four_score=l;
			
				if(player_three_role.equals("RAJA")){
				    
				    k = k+100;
				    j = j+50;
				p_two_score=j;
				p_three_score=k;
				}else{
				    
				j = j+100;
				k = k+50;
				p_three_score=k;
				p_two_score=j;
				}
			    }
	    }

	    }
	if(player_two_role.equals("MANTRI"))
	    {
		if(guess)
    		{
		    Log.v("AkhandBakar", "##########Mantri"+ player_two_name);
		    j = j+80;
		    p_two_score=j;
    		txtTurn.setText(player_two_name+" is right!");
    		btnPod_one.setText(player_one_);
		btnPod_two.setText(player_two_);
		btnPod_three.setText(player_three);
		btnPod_four.setText(player_four);
			btnPod_one.setBackgroundResource(R.drawable.podopen);
			btnPod_two.setBackgroundResource(R.drawable.podopen);
			btnPod_three.setBackgroundResource(R.drawable.podopen);
			btnPod_four.setBackgroundResource(R.drawable.podopen);
    		if(player_one_role.equals("CHOR"))
		    {
    			p_one_score=i;
    			
    			if(player_three_role.equals("RAJA")){
			    
			    k = k+100;
			    l = l+50;
			    p_three_score=k;
			    p_four_score=l;
			    
    			}else{
			    
			    l = l+100;
			    k = k+50;
			    p_four_score=l;
    				p_three_score=k;
    			}
    			
		    }
    		if(player_three_role.equals("CHOR"))
		    {
    			
    			p_three_score=k;
    			
    			
    			if(player_one_role.equals("RAJA")){
    				
			    i = i+100;
			    l = l+50;
    				p_one_score=i;
    				p_four_score=l;
    				
    			}else{
			    
    				l = l+100;
    				i = i+50;
    				p_one_score=i;
    				p_four_score=l;
    				
    			}
    			
		    }
    		if(player_four_role.equals("CHOR"))
		    {
    			
    			p_four_score=l;
    			
    			if(player_one_role.equals("RAJA")){
			    
    				i = i+100;
    				k = k+50;
    				p_one_score=i;
        			p_three_score=k;
    				
    			}else{
			    
			    k = k+100;
    				i = i+50;
    				p_one_score=i;
        			p_three_score=k;
				
				
    			}
    			
    			
		    }
    		}
    	else
	    {
		
    		j=j-80;
    		p_two_score = j;
    		txtTurn.setText(player_two_name+" is wrong!");
    		btnPod_one.setText(player_one_);
		btnPod_two.setText(player_two_);
		btnPod_three.setText(player_three);
		btnPod_four.setText(player_four);
		btnPod_one.setBackgroundResource(R.drawable.podopen);
		btnPod_two.setBackgroundResource(R.drawable.podopen);
		btnPod_three.setBackgroundResource(R.drawable.podopen);
			btnPod_four.setBackgroundResource(R.drawable.podopen);
			if(player_one_role.equals("CHOR"))
			    {
				i = i+25;
				p_one_score=i;
				
			if(player_three_role.equals("RAJA")){
			    
			    k = k+100;
			    l = l+50;
			    p_three_score=k;
				p_four_score=l;
				
			}else{
			    
			    l = l+100;
			    k = k+50;
				p_four_score=l;
				p_three_score=k;
			}
			
			    }
			if(player_three_role.equals("CHOR"))
			    {
			k = k+25;
			p_three_score=k;
			
			
			if(player_one_role.equals("RAJA")){
			    
			    i = i+100;
			    l = l+50;
				p_one_score=i;
				p_four_score=l;
				
			}else{
				
			    l = l+100;
			    i = i+50;
			    p_one_score=i;
				p_four_score=l;
				
			}
			
			    }
			if(player_four_role.equals("CHOR"))
			{
			    l = l+25;
			    p_four_score=l;
			    
			    if(player_one_role.equals("RAJA")){
				
				i = i+100;
				k = k+50;
				p_one_score=i;
				p_three_score=k;
				
			    }else{
				
				k = k+100;
				i = i+50;
				p_one_score=i;
				p_three_score=k;
				
				
			    }
			    
			    
			}
	    }
		
	    }
	if(player_three_role.equals("MANTRI"))
	    {
		Log.v("AkhandBakar", "##########Mantri"+ player_three_name);
		if(guess)
		    {
			k = k+80;
			p_three_score = k;
			txtTurn.setText(player_three_name+" is right!");
			btnPod_one.setText(player_one_);
			btnPod_two.setText(player_two_);
			btnPod_three.setText(player_three);
			btnPod_four.setText(player_four);
			btnPod_one.setBackgroundResource(R.drawable.podopen);
			btnPod_two.setBackgroundResource(R.drawable.podopen);
			btnPod_three.setBackgroundResource(R.drawable.podopen);
			btnPod_four.setBackgroundResource(R.drawable.podopen);
			if(player_one_role.equals("CHOR"))
			    {
				p_one_score=i;
				
				if(player_two_role.equals("RAJA")){
				    
				    j = j+100;
    				l = l+50;
    				p_two_score=j;
        			p_four_score=l;
        			
    				
				}else{
    				
				    l = l+100;
				    j = j+50;
				    p_two_score=j;
				    p_four_score=l;
    				
				    
				}
				
    			}
			if(player_two_role.equals("CHOR"))
			    {
				
				p_two_score=j;
    			
				
				if(player_one_role.equals("RAJA")){
				    
				    i = i+100;
				    l = l+50;
				    p_one_score=i;
				    p_four_score=l;
				    
				}else{
				    
    				i = i+50;
    				l = l+100;
    				p_one_score=i;
    				p_four_score=l;
    				
    			}
				
			    }
			if(player_four_role.equals("CHOR"))
			    {
				
				p_four_score=l;
				
				if(player_two_role.equals("RAJA")){
				    
    				j = j+100;
    				i = i+50;
    				p_one_score=i;
        			p_two_score=j;
    				
				}else{
				    
				    j = j+50;
				    i = i+100;
				    p_one_score=i;
				    p_two_score=j;
				    
				}
				
				
			    }
		    }
		else
		    {
			k = k-80;
			p_three_score = k;
			txtTurn.setText(player_three_name+" is wrong!");
			btnPod_one.setText(player_one_);
			btnPod_two.setText(player_two_);
			btnPod_three.setText(player_three);
			btnPod_four.setText(player_four);
			btnPod_one.setBackgroundResource(R.drawable.podopen);
			btnPod_two.setBackgroundResource(R.drawable.podopen);
			btnPod_three.setBackgroundResource(R.drawable.podopen);
			btnPod_four.setBackgroundResource(R.drawable.podopen);
			if(player_one_role.equals("CHOR"))
			    {
				i = i+25;
				p_one_score=i;
				
				if(player_two_role.equals("RAJA")){
				    
				    j = j+100;
				    l = l+50;
				    p_two_score=j;
				    p_four_score=l;
				    
				    
				}else{
				    
				    l = l+100;
				    j = j+50;
				    p_two_score=j;
				    p_four_score=l;
				    
				    
				}
				
			    }
			if(player_two_role.equals("CHOR"))
			    {
				j = j+25;
				p_two_score=j;
				
				
				if(player_one_role.equals("RAJA")){
				    
				    i = i+100;
				    l = l+50;
				    p_one_score=i;
				    p_four_score=l;
				    
				}else{
				    
				    i = i+50;
				l = l+100;
				p_one_score=i;
				p_four_score=l;
				
				}
				
			    }
			if(player_four_role.equals("CHOR"))
			    {
				l = l+25;
				p_four_score=l;
				
				if(player_two_role.equals("RAJA")){
				    
				    j = j+100;
				    i = i+50;
				    p_one_score=i;
				    p_two_score=j;
				    
				}else{
				    
				    j = j+50;
				    i = i+100;
				    p_one_score=i;
				    p_two_score=j;
				    
			}
				
				
			    }
    		}
		
	    }
	if(player_four_role.equals("MANTRI"))
	    {
		Log.v("AkhandBakar", "##########Mantri"+ player_four_name);
		if(guess)
    		{
		    l = l+80;
		    p_four_score=l;
		    txtTurn.setText(player_four_name+" is right!");
		    btnPod_one.setText(player_one_);
		    btnPod_two.setText(player_two_);
		    btnPod_three.setText(player_three);
		    btnPod_four.setText(player_four);
		    btnPod_one.setBackgroundResource(R.drawable.podopen);
		    btnPod_two.setBackgroundResource(R.drawable.podopen);
		    btnPod_three.setBackgroundResource(R.drawable.podopen);
		    btnPod_four.setBackgroundResource(R.drawable.podopen);
		    if(player_one_role.equals("CHOR"))
    			{
    			p_one_score=i;
    			
    			
    			if(player_two_role.equals("RAJA")){
			    
			    j = j+100;
			    k = k+50;
			    p_two_score=j;
			    p_three_score=k;
			    
    			}else{
			    
			    j = j+50;
			    k = k+100;
			    p_two_score=j;
			    p_three_score=k;
			    
    			}
    			}
    		if(player_two_role.equals("CHOR"))
		    {
			
    			p_two_score=j;
    			
    			
    			if(player_one_role.equals("RAJA")){
			    
			    i = i+100;
			    k = k+50;
			    p_one_score=i;
			    p_three_score=k;
    			}else{
			    
			    i = i+50;
			    k = k+100;
			    p_one_score=i;
			    p_three_score=k;
			    
    			}
    			
		    }
    		if(player_three_role.equals("CHOR"))
		    {
			
    			p_three_score=k;
    			
    			if(player_one_role.equals("RAJA")){
			    
			    i = i+100;
			    j = j+50;
			    p_one_score=i;
			    p_two_score=j;
    			}else{
			    
			    i = i+50;
			    j = j+100;
			    p_one_score=i;
			    p_two_score=j;
			    
    			}
    			
    			
		    }
    		}
		else
		    {
			l = l-80;
			p_four_score = l;
			txtTurn.setText(player_four_name+" is wrong!");
			btnPod_one.setText(player_one_);
			btnPod_two.setText(player_two_);
			btnPod_three.setText(player_three);
			btnPod_four.setText(player_four);
			btnPod_one.setBackgroundResource(R.drawable.podopen);
			btnPod_two.setBackgroundResource(R.drawable.podopen);
			btnPod_three.setBackgroundResource(R.drawable.podopen);
			btnPod_four.setBackgroundResource(R.drawable.podopen);
			if(player_one_role.equals("CHOR"))
			{
			    i = i+25;
			    p_one_score=i;
			    
			    
			    if(player_two_role.equals("RAJA")){
				
				j = j+100;
				k = k+50;
				p_two_score=j;
				p_three_score=k;
				
			    }else{
				
				j = j+50;
				k = k+100;
				p_two_score=j;
				p_three_score=k;
				
			    }
			}
			if(player_two_role.equals("CHOR"))
			{
			    j=j+25;
			    p_two_score=j;
			    
			    
			    if(player_one_role.equals("RAJA")){
				
				i = i+100;
				k = k+50;
				p_one_score=i;
				p_three_score=k;
			    }else{
				
				i = i+50;
				k = k+100;
				p_one_score=i;
				p_three_score=k;
				
			    }
			    
			}
			if(player_three_role.equals("CHOR"))
			    {
			k=k+25;
			p_three_score=k;
			
			if(player_one_role.equals("RAJA")){
				
			    i = i+100;
			    j = j+50;
				p_one_score=i;
				p_two_score=j;
			}else{
			    
			    i = i+50;
			    j = j+100;
			    p_one_score=i;
    			p_two_score=j;
			
			}
			
			
			}
		    }
		
	    }
    	
	
	Log.v("AkhandBakar", "##########Score "+ i);
	txtPlayer_one.setText("1."+ player_one_name + " [" + i + "]");
	Log.v("AkhandBakar", player_one_ + " [" + i + "]");
	
	txtPlayer_two.setText("2." + player_two_name+ " [" + j + "]");
	
	Log.v("AkhandBakar", player_two_ + " [" + p_two_score + "]");
	
	txtPlayer_three.setText("3." + player_three_name+ " [" + k + "]");
	Log.v("AkhandBakar", player_three + " [" + p_three_score + "]");
	
	txtPlayer_four.setText("4."+player_four_name+ " [" + l + "]");	
	Log.v("AkhandBakar", player_four + " [" + p_four_score + "]");
    }
}
