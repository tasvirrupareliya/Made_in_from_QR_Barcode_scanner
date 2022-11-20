package com.rupareliya.madeinindiaqrbarcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public class Country_result extends AppCompatActivity {

    ImageView country_img;
    TextView country_name;
    private InterstitialAd interstitialAd;
    Button sharefriends;
    private final String TAG = Country_result.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_result);

        setTitle("Made In from");

        Intent intent = getIntent();
        String resultfinal = intent.getStringExtra("result");

        country_img = (ImageView) findViewById(R.id.image_country);
        country_name = (TextView) findViewById(R.id.country_name);
        sharefriends = (Button) findViewById(R.id.share_friend);

        sharefriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent2 = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent2.setType("text/plain");
                String shareBody = getString(R.string.share_app);
                sharingIntent2.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent2, "Share using"));
            }
        });

        if (resultfinal.startsWith("30") || resultfinal.startsWith("31") || resultfinal.startsWith("32") || resultfinal.startsWith("33") || resultfinal.startsWith("34") || resultfinal.startsWith("35") || resultfinal.startsWith("36") || resultfinal.startsWith("37")) {
            Toast.makeText(this, "France", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.france);
            country_name.setText("France");
        } else if (resultfinal.startsWith("0") || resultfinal.startsWith("1")) {
            Toast.makeText(this, "USA", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.usa);
            country_name.setText("United States");
        } else if (resultfinal.startsWith("380")) {
            Toast.makeText(this, "Bulgaria", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.bulgaria);
            country_name.setText("Bulgaria");
        } else if (resultfinal.startsWith("383")) {
            Toast.makeText(this, "Slovenia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.slovenia);
            country_name.setText("Slovenia");
        } else if (resultfinal.startsWith("385")) {
            Toast.makeText(this, "Croatia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.croatia);
            country_name.setText("Croatia");
        } else if (resultfinal.startsWith("387")) {
            Toast.makeText(this, "Bosnia and Herzegovina", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.bosniaandherzegovina);
            country_name.setText("Bosnia & Herzegovina");
        } else if (resultfinal.startsWith("389")) {
            Toast.makeText(this, "Montenegro", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.montenegro);
            country_name.setText("Montenegro");
        } else if (resultfinal.startsWith("390")) {
            Toast.makeText(this, "Kosovo", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.kosovo);
            country_name.setText("Kosovo");
        } else if (resultfinal.startsWith("40") || resultfinal.startsWith("41") || resultfinal.startsWith("42") || resultfinal.startsWith("43") || resultfinal.startsWith("44")) {
            Toast.makeText(this, "Germany", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.flag);
            country_name.setText("Germany");
        } else if (resultfinal.startsWith("45")) {
            Toast.makeText(this, "Japan", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.japan);
            country_name.setText("Japan");
        } else if (resultfinal.startsWith("46")) {
            Toast.makeText(this, "Russia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.russia);
            country_name.setText("Russia");
        } else if (resultfinal.startsWith("470")) {
            Toast.makeText(this, "Kyrgyzstan", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.kyrgyzstan);
            country_name.setText("Kyrgyzstan");
        } else if (resultfinal.startsWith("471")) {
            Toast.makeText(this, "Taiwan", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.taiwan);
            country_name.setText("Taiwan");
        } else if (resultfinal.startsWith("474")) {
            Toast.makeText(this, "Estonia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.estonia);
            country_name.setText("Estonia");
        } else if (resultfinal.startsWith("475")) {
            Toast.makeText(this, "Latvia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.latvia);
            country_name.setText("Latvia");
        } else if (resultfinal.startsWith("476")) {
            Toast.makeText(this, "Azerbaijan", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.azerbaijan);
            country_name.setText("Azerbaijan");
        } else if (resultfinal.startsWith("477")) {
            Toast.makeText(this, "Lithuania", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.lithuania);
            country_name.setText("Lithuania");
        } else if (resultfinal.startsWith("478")) {
            Toast.makeText(this, "Uzbekistan", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.uzbekistan);
            country_name.setText("Uzbekistan");
        } else if (resultfinal.startsWith("479")) {
            Toast.makeText(this, "SriLanka", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.srilanka);
            country_name.setText("Sri Lanka");
        } else if (resultfinal.startsWith("480")) {
            Toast.makeText(this, "Philippines", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.philippines);
            country_name.setText("Philippines");
        } else if (resultfinal.startsWith("481")) {
            Toast.makeText(this, "Belarus", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.belarus);
            country_name.setText("Belarus");
        } else if (resultfinal.startsWith("482")) {
            Toast.makeText(this, "Ukraine", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.ukraine);
            country_name.setText("Ukraine");
        } else if (resultfinal.startsWith("483")) {
            Toast.makeText(this, "Turkmenistan", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.turkmenistan);
            country_name.setText("Turkmenistan");
        } else if (resultfinal.startsWith("484")) {
            Toast.makeText(this, "Moldova", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.moldova);
            country_name.setText("Moldova");
        } else if (resultfinal.startsWith("485")) {
            Toast.makeText(this, "Armenia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.armenia);
            country_name.setText("Armenia");
        } else if (resultfinal.startsWith("486")) {
            Toast.makeText(this, "Georgia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.georgia);
            country_name.setText("Georgia");
        } else if (resultfinal.startsWith("487")) {
            Toast.makeText(this, "Kazakhstan", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.kazakhstan);
            country_name.setText("Kazakhstan");
        } else if (resultfinal.startsWith("488")) {
            Toast.makeText(this, "Tajikistan", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.tajikistan);
            country_name.setText("Tajikistan");
        } else if (resultfinal.startsWith("489")) {
            Toast.makeText(this, "Hong Kong", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.hongkong);
            country_name.setText("Hong Kong");
        } else if (resultfinal.startsWith("50")) {
            Toast.makeText(this, "United Kingdom", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.uk);
            country_name.setText("United Kingdom");
        } else if (resultfinal.startsWith("520") || resultfinal.startsWith("521")) {
            Toast.makeText(this, "Greece", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.greece);
            country_name.setText("Greece");
        } else if (resultfinal.startsWith("528")) {
            Toast.makeText(this, "Lebanon", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.lebanon);
            country_name.setText("Lebanon");
        } else if (resultfinal.startsWith("529")) {
            Toast.makeText(this, "Cyprus", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.northencyprus);
            country_name.setText("Cyprus");
        } else if (resultfinal.startsWith("530")) {
            Toast.makeText(this, "Albania", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.albania);
            country_name.setText("Albania");
        } else if (resultfinal.startsWith("531")) {
            Toast.makeText(this, "North Macedonia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.macedonia);
            country_name.setText("North Macedonia");
        } else if (resultfinal.startsWith("535")) {
            Toast.makeText(this, "Malta", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.malta);
            country_name.setText("Malta");
        } else if (resultfinal.startsWith("539")) {
            Toast.makeText(this, "Ireland", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.ireland);
            country_name.setText("Ireland");
        } else if (resultfinal.startsWith("54")) {
            Toast.makeText(this, "Belgium ", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.belgium);
            country_name.setText("Belgium");
        } else if (resultfinal.startsWith("560")) {
            Toast.makeText(this, "Portugal", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.portugal);
            country_name.setText("Portugal");
        } else if (resultfinal.startsWith("569")) {
            Toast.makeText(this, "Iceland", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.iceland);
            country_name.setText("Iceland");
        } else if (resultfinal.startsWith("570") || resultfinal.startsWith("571") || resultfinal.startsWith("572") || resultfinal.startsWith("573") || resultfinal.startsWith("574") || resultfinal.startsWith("575") || resultfinal.startsWith("576") || resultfinal.startsWith("577") || resultfinal.startsWith("578") || resultfinal.startsWith("579")) {
            Toast.makeText(this, "Denmark", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.denmark);
            country_name.setText("Denmark");
        } else if (resultfinal.startsWith("590")) {
            Toast.makeText(this, "Poland", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.poland);
            country_name.setText("Poland");
        } else if (resultfinal.startsWith("594")) {
            Toast.makeText(this, "Romania", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.romania);
            country_name.setText("Romania");
        } else if (resultfinal.startsWith("599")) {
            Toast.makeText(this, "Hungary", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.hungary);
            country_name.setText("Hungary");
        } else if (resultfinal.startsWith("600") || resultfinal.startsWith("601")) {
            Toast.makeText(this, "South Africa", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.southafrica);
            country_name.setText("South Africa");
        } else if (resultfinal.startsWith("603")) {
            Toast.makeText(this, "Ghana", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.ghana);
            country_name.setText("Ghana");
        } else if (resultfinal.startsWith("604")) {
            Toast.makeText(this, "Senegal", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.senegal);
            country_name.setText("Senegal");
        } else if (resultfinal.startsWith("608")) {
            Toast.makeText(this, "Bahrain", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.bahrain);
            country_name.setText("Bahrain");
        } else if (resultfinal.startsWith("609")) {
            Toast.makeText(this, "Mauritius", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.mauritius);
            country_name.setText("Mauritius");
        } else if (resultfinal.startsWith("611")) {
            Toast.makeText(this, "Morocco", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.morocco);
            country_name.setText("Morocco");
        } else if (resultfinal.startsWith("613")) {
            Toast.makeText(this, "Algeria", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.algeria);
            country_name.setText("Algeria");
        } else if (resultfinal.startsWith("615")) {
            Toast.makeText(this, "Nigeria", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.nigeria);
            country_name.setText("Nigeria");
        } else if (resultfinal.startsWith("616")) {
            Toast.makeText(this, "Kenya", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.kenya);
            country_name.setText("Kenya");
        } else if (resultfinal.startsWith("617")) {
            Toast.makeText(this, "Cameroon", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.cameroon);
            country_name.setText("Cameroon");
        } else if (resultfinal.startsWith("618")) {
            Toast.makeText(this, "Ivory Coast", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.ivorycoast);
            country_name.setText("Ivory Coast");
        } else if (resultfinal.startsWith("619")) {
            Toast.makeText(this, "Tunisia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.tunisia);
            country_name.setText("Tunisia");
        } else if (resultfinal.startsWith("620")) {
            Toast.makeText(this, "Tanzania", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.tanzania);
            country_name.setText("Tanzania");
        } else if (resultfinal.startsWith("621")) {
            Toast.makeText(this, "Syria", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.syria);
            country_name.setText("Syria");
        } else if (resultfinal.startsWith("622")) {
            Toast.makeText(this, "Egypt", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.egypt);
            country_name.setText("Egypt");
        } else if (resultfinal.startsWith("623")) {
            Toast.makeText(this, "Brunei", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.brunei);
            country_name.setText("Brunei");
        } else if (resultfinal.startsWith("624")) {
            Toast.makeText(this, "Libya", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.libya);
            country_name.setText("Libya");
        } else if (resultfinal.startsWith("625")) {
            Toast.makeText(this, "Jordan", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.jordan);
            country_name.setText("Jordan");
        } else if (resultfinal.startsWith("626")) {
            Toast.makeText(this, "Iran", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.iran);
            country_name.setText("Iran");
        } else if (resultfinal.startsWith("627")) {
            Toast.makeText(this, "Kuwait", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.kuwait);
            country_name.setText("Kuwait");
        } else if (resultfinal.startsWith("628")) {
            Toast.makeText(this, "Saudi Arabia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.saudiarabia);
            country_name.setText("Saudi Arabia");
        } else if (resultfinal.startsWith("629")) {
            Toast.makeText(this, "United Arab Emirates", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.unitedarabemirates);
            country_name.setText("United Arab Emirates");
        } else if (resultfinal.startsWith("630")) {
            Toast.makeText(this, "Qatar", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.qatar);
            country_name.setText("Qatar");
        } else if (resultfinal.startsWith("64")) {
            Toast.makeText(this, "Finland", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.finland);
            country_name.setText("Finland");
        } else if (resultfinal.startsWith("69")) {
            Toast.makeText(this, "China", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.china);
            country_name.setText("China");
        } else if (resultfinal.startsWith("70")) {
            Toast.makeText(this, "Norway", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.norway);
            country_name.setText("Norway");
        } else if (resultfinal.startsWith("729")) {
            Toast.makeText(this, "Israel", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.israel);
            country_name.setText("Israel");
        } else if (resultfinal.startsWith("730") || resultfinal.startsWith("731")) {
            Toast.makeText(this, "Sweden", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.sweden);
            country_name.setText("Sweden");
        } else if (resultfinal.startsWith("740")) {
            Toast.makeText(this, "Guatemala", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.guatemala);
            country_name.setText("Guatemala");
        } else if (resultfinal.startsWith("741")) {
            Toast.makeText(this, "El Salvador", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.elsalvador);
            country_name.setText("El salvador");
        } else if (resultfinal.startsWith("742")) {
            Toast.makeText(this, "Honduras", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.honduras);
            country_name.setText("Honduras");
        } else if (resultfinal.startsWith("743")) {
            Toast.makeText(this, "Nicaragua", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.nicaragua);
            country_name.setText("Nicaragua");
        } else if (resultfinal.startsWith("744")) {
            Toast.makeText(this, "Costa Rica", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.costarica);
            country_name.setText("Costa Rica");
        } else if (resultfinal.startsWith("745")) {
            Toast.makeText(this, "Panama", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.panama);
            country_name.setText("Panama");
        } else if (resultfinal.startsWith("746")) {
            Toast.makeText(this, "Dominican Republic", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.dominicarepublic);
            country_name.setText("Dominican Republic");
        } else if (resultfinal.startsWith("750")) {
            Toast.makeText(this, "Mexico", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.mexico);
            country_name.setText("Mexico");
        } else if (resultfinal.startsWith("754") || resultfinal.startsWith("755")) {
            Toast.makeText(this, "Canada", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.canada);
            country_name.setText("Canada");
        } else if (resultfinal.startsWith("759")) {
            Toast.makeText(this, "Venezuela", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.venezuela);
            country_name.setText("Venezuela");
        } else if (resultfinal.startsWith("760") || resultfinal.startsWith("761") || resultfinal.startsWith("762") || resultfinal.startsWith("763") || resultfinal.startsWith("764") || resultfinal.startsWith("765") || resultfinal.startsWith("766") || resultfinal.startsWith("767") || resultfinal.startsWith("768") || resultfinal.startsWith("769")) {
            Toast.makeText(this, "Switzerland", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.switzerland);
            country_name.setText("Switzerland");
        } else if (resultfinal.startsWith("770") || resultfinal.startsWith("771")) {
            Toast.makeText(this, "Colombia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.colombia);
            country_name.setText("Colombia");
        } else if (resultfinal.startsWith("773")) {
            Toast.makeText(this, "Uruguay", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.uruguay);
            country_name.setText("Uruguay");
        } else if (resultfinal.startsWith("775")) {
            Toast.makeText(this, "Peru", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.peru);
            country_name.setText("Peru");
        } else if (resultfinal.startsWith("777")) {
            Toast.makeText(this, "Bolivia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.bolivia);
            country_name.setText("Bolivia");
        } else if (resultfinal.startsWith("778") || resultfinal.startsWith("779")) {
            Toast.makeText(this, "Argentina", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.argentina);
            country_name.setText("Argentina");
        } else if (resultfinal.startsWith("780")) {
            Toast.makeText(this, "Chile", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.chile);
            country_name.setText("Chile");
        } else if (resultfinal.startsWith("784")) {
            Toast.makeText(this, "Paraguay", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.paraguay);
            country_name.setText("Paraguay");
        } else if (resultfinal.startsWith("786")) {
            Toast.makeText(this, "Ecuador", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.ecuador);
            country_name.setText("Ecuador");
        } else if (resultfinal.startsWith("789") || resultfinal.startsWith("790")) {
            Toast.makeText(this, "Brazil", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.brazil);
            country_name.setText("Brazil");
        } else if (resultfinal.startsWith("80") || resultfinal.startsWith("81") || resultfinal.startsWith("82") || resultfinal.startsWith("83")) {
            Toast.makeText(this, "Italy", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.italy);
            country_name.setText("Italy");
        } else if (resultfinal.startsWith("840") || resultfinal.startsWith("841") || resultfinal.startsWith("842") || resultfinal.startsWith("843") || resultfinal.startsWith("844") || resultfinal.startsWith("845") || resultfinal.startsWith("846") || resultfinal.startsWith("847") || resultfinal.startsWith("848") || resultfinal.startsWith("849")) {
            Toast.makeText(this, "Spain", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.spain);
            country_name.setText("Spain");
        } else if (resultfinal.startsWith("850")) {
            Toast.makeText(this, "Cuba", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.cuba);
            country_name.setText("Cuba");
        } else if (resultfinal.startsWith("858")) {
            Toast.makeText(this, "Slovakia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.slovakia);
            country_name.setText("Slovakia");
        } else if (resultfinal.startsWith("859")) {
            Toast.makeText(this, "Czech Republic", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.czechrepublic);
            country_name.setText("Czech Republic");
        } else if (resultfinal.startsWith("860")) {
            Toast.makeText(this, "Serbia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.serbia);
            country_name.setText("Serbia");
        } else if (resultfinal.startsWith("865")) {
            Toast.makeText(this, "Mongolia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.mongolia);
            country_name.setText("Mongolia");
        } else if (resultfinal.startsWith("867")) {
            Toast.makeText(this, "North Korea", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.northkorea);
            country_name.setText("North Korea");
        } else if (resultfinal.startsWith("868") || resultfinal.startsWith("869")) {
            Toast.makeText(this, "Turkey", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.turkey);
            country_name.setText("Turkey");
        } else if (resultfinal.startsWith("87")) {
            Toast.makeText(this, "Netherlands", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.netherlands);
            country_name.setText("Netherlands");
        } else if (resultfinal.startsWith("880")) {
            Toast.makeText(this, "North Korea", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.northkorea);
            country_name.setText("North Korea");
        } else if (resultfinal.startsWith("883")) {
            Toast.makeText(this, "Myanmar", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.myanmar);
            country_name.setText("Myanmar");
        } else if (resultfinal.startsWith("884")) {
            Toast.makeText(this, "Cambodia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.cambodia);
            country_name.setText("Cambodia");
        } else if (resultfinal.startsWith("885")) {
            Toast.makeText(this, "Thailand", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.thailand);
            country_name.setText("Thailand");
        } else if (resultfinal.startsWith("888")) {
            Toast.makeText(this, "Singapore", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.singapore);
            country_name.setText("Singapore");
        } else if (resultfinal.startsWith("890")) {
            Toast.makeText(this, "India", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.india);
            country_name.setText("India");
        } else if (resultfinal.startsWith("893")) {
            Toast.makeText(this, "Vietnam", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.vietnam);
            country_name.setText("Vietnam");
        } else if (resultfinal.startsWith("896")) {
            Toast.makeText(this, "Pakistan", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.pakistan);
            country_name.setText("Pakistan");
        } else if (resultfinal.startsWith("899")) {
            Toast.makeText(this, "Indonesia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.indonesia);
            country_name.setText("Indonesia");
        } else if (resultfinal.startsWith("90") || resultfinal.startsWith("91")) {
            Toast.makeText(this, "Austria", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.austria);
            country_name.setText("Austria");
        } else if (resultfinal.startsWith("93")) {
            Toast.makeText(this, "Australia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.australia);
            country_name.setText("Australia");
        } else if (resultfinal.startsWith("94")) {
            Toast.makeText(this, "New Zealand", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.newzealand);
            country_name.setText("New Zealand");
        } else if (resultfinal.startsWith("955")) {
            Toast.makeText(this, "Malaysia", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.malaysia);
            country_name.setText("Malaysia");
        } else if (resultfinal.startsWith("958")) {
            Toast.makeText(this, "Macao", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.macao);
            country_name.setText("Macao");
        } else {
            Toast.makeText(this, "Not Find Country", Toast.LENGTH_SHORT).show();
            country_img.setBackgroundResource(R.drawable.question);
            country_name.setText("Not Find Country");
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {

        ConnectivityManager manager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = manager.getActiveNetworkInfo();

       /* if (networkInfo != null) {
            if (networkInfo.getType() == ConnectivityManager.TYPE_WIFI || networkInfo.getType() == ConnectivityManager.TYPE_MOBILE) {

             *//*   final ProgressDialog dialog = new ProgressDialog(Country_result.this);
                dialog.setCancelable(false);
                dialog.setMessage("Ads Loading");
                dialog.show();*//*

                interstitialAd = new InterstitialAd(this, getString(R.string.interstitial_id));
                // Create listeners for the Interstitial Ad
                InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
                    @Override
                    public void onInterstitialDisplayed(Ad ad) {
                        // Interstitial ad displayed callback
                        Log.e(TAG, "Interstitial ad displayed.");
                    }

                    @Override
                    public void onInterstitialDismissed(Ad ad) {
                        // Interstitial dismissed callback
                        Log.e(TAG, "Interstitial ad dismissed.");
                        Intent intent = new Intent(Country_result.this, MainActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        // Ad error callback
                        Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        // Interstitial ad is loaded and ready to be displayed
                        Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                        interstitialAd.show();
                      *//*  dialog.dismiss();*//*
                    }

                    @Override
                    public void onAdClicked(Ad ad) {
                        // Ad clicked callback
                        Log.d(TAG, "Interstitial ad clicked!");
                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {
                        // Ad impression logged callback
                        Log.d(TAG, "Interstitial ad impression logged!");
                    }
                };

                // For auto play video ads, it's recommended to load the ad
                // at least 30 seconds before it is shown
                interstitialAd.loadAd(
                        interstitialAd.buildLoadAdConfig()
                                .withAdListener(interstitialAdListener)
                                .build());
            }
        } else {*/
            Intent intent = new Intent(Country_result.this, MainActivity.class);
            startActivity(intent);
        //}
    }

    @Override
    protected void onDestroy() {
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        super.onDestroy();
    }
}