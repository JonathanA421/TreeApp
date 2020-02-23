package com.tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.particles.influencers.ColorInfluencer.Random;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
public class TreeMain extends ApplicationAdapter {
	SpriteBatch batch;
	Texture bg, textBox, leaf;
	ShapeRenderer shapeR;
	BitmapFont boxText;
	float mX, mY;
	int r,xx,yy,ro;
	int x[], y[], o[];
	//File file;
	//Scanner input;
	String facts[] = {"The definition sustainability\nis the depletion of natural\nresources in order to\nmaintain an ecological\nbalance","There are 3.5 billion to 7\nbillion trees cut down\neach year","Forests are responsible\nfor storing massive amounts\nof carbon, but when they\nare cut down they release\nthe carbon back into the air","Swapping from incandescent to\nLED light bulbs are 90%\nmore efficient","Bag groceries in reusable bags","Recycling one ton of papers saves\n17 trees\n7000 gallons of water\n20 barrels of oil\n4200 kWh of electricity","Grow your own vegetable garden","Use reusable cups instead of\ndisposable cups to reduce the\namount of waste produced","Reduce, Reuse, Recycle","Cutting 2 minutes from shower\ntime saves 10 gallons of water","Having a recycling bin prominent\nin a house will help encourage\npeople to recycle","Use cloth towels or hand dryers\ninstead of paper towels","A tap leaking at a rate of one\ndrop per second can waste 5.5\ngallons of water or more in a day","Inspect your sprinklers regularly\nto make sure there are no leaks\nor damages","Defrost food by using a\nmicrowave instead of running\nit under warm water","Use a cover to reduce evaporation\nwhen a swimming pool is not\nbeing used","Go to a commercial car wash\ninstead of doing on your\ndriveway to save water","Purchase rechargeable\nbatteries instead of single use","Reuse glass jars","Choose the option to not have\nreceipts at restaurants or gas\nstations","Reuse gift bags, wrapping paper,\nbows, ribbon, and boxes for \nbirthdays or holidays","Use chemical cleaners that\nare non-toxic","Try using cloth napkins instead\nof paper napkins","Purchase paper napkins that\nare made from recycled material","Use cold water when washing\nclothes whenever possible","Use toaster ovens, microwaves,\nor slow cookers instead of using\nlarge appliances","Avoid preheating the oven","Every 100 pounds of excess weight\nfor a car decrease the mileage \nby 2%","Unplugging appliances when not\nin use can save electricity","Changing bills and bank\nstatements to come online can\nreduce paper use","Consuming meat, poultry and\nfish uses more resources than\n eating plants","Freeze food before it spoils so\nit does not have to be wasted","Use a rug. It will keep the\nhouse insulated and reduce\nelectricity used on heating","Biking, walking, or taking public\ntransport can reduce a person's\ncarbon emissions","Having a well-maintenanced car\ncan reduce the amount of toxic\nfumes released","Reduce waste, most of it ends up\n in our oceans","Open up the blinds and use as\nmuch natural light as possible","Organise carpool to work,\nsporting events, and other\nactivities","Try using double-sided printing\n when possible","Use a dishwasher instead of\nhand washing your dishes","Limit the amount of water you\nuse to brush your teeth to\nreduce water"};
	String a,d;
	int index = 0;
	int first = 0;
	int loop =0;
	int total = 0;
	FileHandle file; //= Gdx.files.internal("WacodeFactsJack.txt");
	Random random;
	
    

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		bg = new Texture("background.jpg");
		textBox = new Texture("texBox.png");
		shapeR = new ShapeRenderer();
		boxText = new BitmapFont(Gdx.files.internal("boxText.fnt"));
		leaf = new Texture("leaves.png");
		random = new Random();
		x = new int[1000];
		y = new int[1000];
		o = new int[1000];
		//file = new File("WacodeFactsJack.txt");
		//input = new Scanner(file);
		
		
       
		
	}

	@Override
	public void render () {
		/*file = Gdx.files.internal("WacodeFactsJack.txt");
		a = file.readString();
		for(int i = 0; i<41; i++) {
			facts[i] = "";
			while(a != "*"){
				a = file.readString();
				index++;
				if(index%4 == 0) {
					facts[i] += a;
				}
			}
			index = 0;
		}*/
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		mX = Gdx.input.getX();
		mY = Gdx.input.getY();
		//System.out.println("mx = " + mX + " " + "my = " + mY);
		
		batch.begin();
		//background img
		batch.draw(bg, 0, 0);
		batch.draw(textBox, 780, 0);
		
		//batch.draw(leaf, 200, 500, 32, 32, 64, 64, 1f, 1f, 100f, 0, 0, 64, 64, false, false);

		batch.end();
		
		/*
		//text box and frame
		shapeR.begin(ShapeType.Filled);
		shapeR.setColor(0, 0, 0, 0);
		shapeR.rect(790, 10, 670, 520);
		shapeR.setColor(1, 1, 1, 0);
		shapeR.rect(800, 20, 650, 500);
		shapeR.end();*/
		if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
			System.out.println("mx = " + mX + " " + "my = " + mY);
		}
		 if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
			 System.out.println("mx = " + mX + " " + "my = " + mY);
		 }
		if (Gdx.input.isButtonPressed(Input.Buttons.RIGHT)){
			r = (int)(Math.random()*41);
			
			x[total] = (int)(Math.random()*450+200);
			y[total] = (int)(Math.random()*500+100);
			o[total] = (int)(Math.random()*360);
			total++;
			//System.out.println(facts[r]);
			//batch.begin();
			//boxText.draw(batch, facts[r], 825, 517);
		//	batch.end();
		}
		batch.begin();
		boxText.draw(batch, facts[r], 825, 517);
		//for(int j = 0; j<total;j++) {
			
			
			for(int i = 0; i<total; i++) {
				batch.draw(leaf, y[i], x[i], 32, 32, 64, 64, 1f, 1f, (float)o[i], 0, 0, 64, 64, false, false);
			}
		
		//}
		//batch.draw(leaf, yy, xx, 32, 32, 64, 64, 1f, 1f, (float)ro, 0, 0, 64, 64, false, false);
		batch.end();
		//batch.begin();
	    //boxText.draw(batch, "Take one half bottle for moderate\nenergy. Do not exceed two\nbottles daily!", 825, 517);
	    //batch.end();
		loop++;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		bg.dispose();
		shapeR.dispose();
	}
}
