package app.com.example.simran.placebooks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    String book2 = "stock",book3="stock",book1="stock",book4="stock",book5="stock";
    int i1=0,i2=0,i3=0,i4=0,i5=0;



    public void addcart2

            (View view) {
        TextView message = (TextView) findViewById(R.id.addcartimage2);
        if (message != null) {
            book2 = "placed";i2++;


        }
    }
        public void cancelorder2(View view)

    {
         book2="stock";i2--;

    }
    public void addcart3

            (View view) {
        TextView message = (TextView) findViewById(R.id.addcartimage3);
        if (message != null) {
            book3 = "placed";i3++;


        }
    }
    public void cancelorder3(View view)

    {
        book3="stock";i3--;

    }
    public void addcart4

            (View view) {
        TextView message = (TextView) findViewById(R.id.addcartimage4);
        if (message != null) {
            book4 = "placed";i4++;


        }
    }
    public void cancelorder4(View view)

    {
        book4="stock";i4--;

    }
    public void addcart5

            (View view) {
        TextView message = (TextView) findViewById(R.id.addcartimage2);
        if (message != null) {
            book5 = "placed";i5++;


        }
    }
    public void cancelorder5(View view)

    {
        book5="stock";i5--;

    }
    public void addcart1

            (View view) {
        TextView message = (TextView) findViewById(R.id.addcartimage2);
        if (message != null) {
            book1 = "placed";i1++;


        }
    }
    public void cancelorder1(View view)

    {
        book1="stock";i1--;

    }
    public String message()
    {   TextView t;
        String finalmsg="\0";
        if(book2=="placed") {
            t = (TextView) findViewById(R.id.book2);
            finalmsg += t.getText().toString();
            finalmsg += "\t" + "RS 350\n";
        }
        if(book3=="placed") {
            t = (TextView) findViewById(R.id.book3);
            finalmsg += t.getText().toString();
            finalmsg += "\t" + "RS 200\n";
        }
        if(book4=="placed") {
            t = (TextView) findViewById(R.id.book4);
            finalmsg += t.getText().toString();
            finalmsg += "\t" + "RS 250\n";
        }
        if(book5=="placed") {
            t = (TextView) findViewById(R.id.book5);
            finalmsg += t.getText().toString();
            finalmsg += "\t" + "RS 450\n";
        }
        if(book1=="placed") {
            t = (TextView) findViewById(R.id.book1);
            finalmsg += t.getText().toString();
            finalmsg += "\t" + "RS 450 \n";
        }

        return finalmsg;
    }
    public void placeorder(View view)
    {    TextView receipt;
        String display=message();

        //Button mybutton = (Button) findViewById(R.id.placeorder);
       receipt=(TextView) findViewById(R.id.receipt);
        int sum=0;
        if(book1=="placed")
        {sum+=450*i1;

        }
        if(book2=="placed")
        {sum+=350*i2;

        }
        if(book3=="placed")
        {sum+=200*i3;

        }
        if(book4=="placed")
        {sum+=250*i4;

        }
        if(book5=="placed")
        {sum+=450*i5;

        }
        display+=" "+" TOTAL = "+sum+"\n";
        receipt.setText(display);



       /* assert mybutton != null;
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String display=String.format(getString(R.id.receipt));
                receipt.setText(display);
                setContentView(receipt);

            }
        });*/


    }

  /* public void display(String b) {
        TextView message1 = (TextView) findViewById(R.id.test2);
        Button mybutton = (Button) findViewById(R.id.readmore2);
        mybutton.setY(52);

        message1.setText("" + b);
    }*/

    public void readmore2(View view) {
        Button mybutton = (Button) findViewById(R.id.readmore2);
        String buttonText= (String) mybutton.getText();
        TextView info2=(TextView) findViewById(R.id.test2);
        String information2 ;
        information2="Dan brown wrote an excellent novel about Angels and Demons.One of the finest novel" +
                "written in the decade so far" +
                "When world-renowned Harvard symbologist Robert Langdon is summoned to a Swiss " +
                "research facility to analyze a mysterious symbol—seared into the chest of a" +
                " murdered physicist—he discovers evidence of the unimaginable: the resurgence of an ancient " +
                "secret brotherhood known as the Illuminati ... the most powerful underground organization ever to walk the earth." +
                " The Illuminati has now surfaced to carry out the final phase of its legendary vendetta against its most hated enemy—the Catholic Church. ";
       String yes="READMORE";
        String no="READLESS";
       /* ViewGroup.LayoutParams v=mybutton.getLayoutP
        arams();
        if(v!=null)
        {
            RelativeLayout.LayoutParams v1=new RelativeLayout.LayoutParams(v);

            v1.addRule(42);
            mybutton.setLayoutParams(v1);}
    }*/
        if(buttonText.equals(yes)){
            info2.setText(information2);

            mybutton.setY(250);


            mybutton.setText("READLESS");
        }
       else {
            if (buttonText.equals(no)) {
                mybutton.setY(150);
                mybutton.setText("READMORE");
                info2.setText(information2);
                info2.setLines(2);
            }
        }

    }
    public void readmore3(View view) {
        Button mybutton = (Button) findViewById(R.id.readmore3);
        String buttonText= (String) mybutton.getText();
        TextView info2=(TextView) findViewById(R.id.test3);
        String information2 ;
        information2="IT'S NOT EVERYDAY YOU FIND YOURSELF IN COMBAT WITH A HALF-LION, HALF-HUMAN.\n" +
                "\n" +
                "But when you're the son of a Greek god, it happens. And now my friend Annabeth is missing," +
                " a goddess is in chains and only five half-blood heroes can join the quest to defeat the doomsday monster.\n" +
                "\n" +
                "Oh, and guess what? The Oracle has predicted that not all of us will survive...";
        String yes="READMORE";
        String no="READLESS";
       /* ViewGroup.LayoutParams v=mybutton.getLayoutP
        arams();
        if(v!=null)
        {
            RelativeLayout.LayoutParams v1=new RelativeLayout.LayoutParams(v);

            v1.addRule(42);
            mybutton.setLayoutParams(v1);}
    }*/
        if(buttonText.equals(yes)){
            info2.setText(information2);

            mybutton.setY(250);


            mybutton.setText("READLESS");
        }
        else {
            if (buttonText.equals(no)) {
                mybutton.setY(150);
                mybutton.setText("READMORE");
                info2.setText(information2);
                info2.setLines(2);
            }
        }
    }
    public void readmore4(View view) {
        Button mybutton = (Button) findViewById(R.id.readmore4);
        String buttonText= (String) mybutton.getText();
        TextView info2=(TextView) findViewById(R.id.test4);
        String information2 ;
        information2="Seventh grade has been surprisingly quiet for Percy Jackson." +
                " Not a single monster has set foot on his New York prep-school campus." +
                " But when an innocent game of dodgeball among Percy and his classmates turns into a death match against an " +
                "ugly gang of cannibal giants, things get...well, ugly. And the unexpected arrival of his friend Annabeth brings more bad news: the magical .";
        String yes="READMORE";
        String no="READLESS";
       /* ViewGroup.LayoutParams v=mybutton.getLayoutP
        arams();
        if(v!=null)
        {
            RelativeLayout.LayoutParams v1=new RelativeLayout.LayoutParams(v);

            v1.addRule(42);
            mybutton.setLayoutParams(v1);}
    }*/
        if(buttonText.equals(yes)){
            info2.setText(information2);

            mybutton.setY(250);


            mybutton.setText("READLESS");
        }
        else {
            if (buttonText.equals(no)) {
                mybutton.setY(150);
                mybutton.setText("READMORE");
                info2.setText(information2);
                info2.setLines(2);
            }
        }
    }
    public void readmore5(View view) {
        Button mybutton = (Button) findViewById(R.id.readmore5);
        String buttonText= (String) mybutton.getText();
        TextView info2=(TextView) findViewById(R.id.test5);
        String information2 ;
        information2="In his international blockbusters The Da Vinci Code, Angels & Demons, and The Lost Symbol," +
                " Dan Brown masterfully fused history, art, codes, and symbols. In this riveting new thriller, " +
                "Brown returns to his element and has crafted his highest-stakes novel to date.\n" +
                "In the heart of Italy, Harvard professor of symbology Robert Langdon is drawn into a harrowing world centered";
        String yes="READMORE";
        String no="READLESS";
       /* ViewGroup.LayoutParams v=mybutton.getLayoutP
        arams();
        if(v!=null)
        {
            RelativeLayout.LayoutParams v1=new RelativeLayout.LayoutParams(v);

            v1.addRule(42);
            mybutton.setLayoutParams(v1);}
    }*/
        if(buttonText.equals(yes)){
            info2.setText(information2);

            mybutton.setY(250);


            mybutton.setText("READLESS");
        }
        else {
            if (buttonText.equals(no)) {
                mybutton.setY(150);
                mybutton.setText("READMORE");
                info2.setText(information2);
                info2.setLines(2);
            }
        }
    }
    public void readmore1(View view) {
        Button mybutton = (Button) findViewById(R.id.readmore1);
        String buttonText= (String) mybutton.getText();
        TextView info2=(TextView) findViewById(R.id.test1);
        String information2 ;
        information2="An ingenious code hidden in the works of Leonardo da Vinci. " +
                "A desperate race through the cathedrals and castles of Europe. An astonishing truth concealed for centuries . . . unveiled at last.\n" +

                "While in Paris, Harvard symbologist Robert Langdon is awakened " +
                "by a phone call in the dead of the night. The elderly curator of the Louvre has been murdered inside the museum, his body ..";
        String yes="READMORE";
        String no="READLESS";
       /* ViewGroup.LayoutParams v=mybutton.getLayoutP
        arams();
        if(v!=null)
        {
            RelativeLayout.LayoutParams v1=new RelativeLayout.LayoutParams(v);

            v1.addRule(42);
            mybutton.setLayoutParams(v1);}
    }*/
        if(buttonText.equals(yes)){
            info2.setText(information2);

            mybutton.setY(250);


            mybutton.setText("READLESS");
        }
        else {
            if (buttonText.equals(no)) {
                mybutton.setY(150);
                mybutton.setText("READMORE");
                info2.setText(information2);
                info2.setLines(2);
            }
        }
    }

}
