package com.example.admin.mytimetable;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button[] buttons = createButton();
        for (int i = 0; i < buttons.length; i++) {
            if (i == 0 || i == 5 || i == 6 || i == 9 || i == 13 || i == 14 || i == 15 || i ==  18 || i == 21 || i == 23) {
                if (i == 0) {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Toast toast = Toast.makeText(MainActivity.this, "この時間の授業は 新ネットワーク理論 です.", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    });
                }
                else if (i == 5) {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Toast toast = Toast.makeText(MainActivity.this, "この時間の授業は 人工知能 です.", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    });
                }
                else if (i == 6) {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Toast toast = Toast.makeText(MainActivity.this, "この時間の授業は テクニカルライティング1 です.", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    });
                }
                else if (i == 9) {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Toast toast = Toast.makeText(MainActivity.this, "この時間の授業は 数式処理システム です.", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    });
                }
                else if (i == 13) {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Toast toast = Toast.makeText(MainActivity.this, "この時間の授業は 社会と科学1 です.", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    });
                }
                else if (i == 14) {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Toast toast = Toast.makeText(MainActivity.this, "この時間の授業は プロジェクト3A です.", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    });
                }
                else if (i == 15) {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Toast toast = Toast.makeText(MainActivity.this, "この時間の授業は プログラミング演習3 です.", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    });
                }
                else if (i == 18) {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Toast toast = Toast.makeText(MainActivity.this, "この時間の授業は ソフトウェア開発の形式工学手法 です.", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    });
                }
                else if (i == 21) {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Toast toast = Toast.makeText(MainActivity.this, "この時間の授業は FD です.", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    });
                }
                else if (i == 23) {
                    buttons[i].setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Toast toast = Toast.makeText(MainActivity.this, "この時間の授業は Web+DB入門 です.", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    });
                }
            } else {
                buttons[i].setBackgroundColor(Color.WHITE);
                buttons[i].setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(MainActivity.this, "この時間の授業はありません.", Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
            }
        }
    }
    Button[] createButton() {
        final Button[] buttons = new Button[25];
        buttons[0] = (Button) findViewById(R.id.button1);
        buttons[1] = (Button) findViewById(R.id.button2);
        buttons[2] = (Button) findViewById(R.id.button3);
        buttons[3] = (Button) findViewById(R.id.button4);
        buttons[4] = (Button) findViewById(R.id.button5);
        buttons[5] = (Button) findViewById(R.id.button6);
        buttons[6] = (Button) findViewById(R.id.button7);
        buttons[7] = (Button) findViewById(R.id.button8);
        buttons[8] = (Button) findViewById(R.id.button9);
        buttons[9] = (Button) findViewById(R.id.button10);
        buttons[10] = (Button) findViewById(R.id.button11);
        buttons[11] = (Button) findViewById(R.id.button12);
        buttons[12] = (Button) findViewById(R.id.button13);
        buttons[13] = (Button) findViewById(R.id.button14);
        buttons[14] = (Button) findViewById(R.id.button15);
        buttons[15] = (Button) findViewById(R.id.button16);
        buttons[16] = (Button) findViewById(R.id.button17);
        buttons[17] = (Button) findViewById(R.id.button18);
        buttons[18] = (Button) findViewById(R.id.button19);
        buttons[19] = (Button) findViewById(R.id.button20);
        buttons[20] = (Button) findViewById(R.id.button21);
        buttons[21] = (Button) findViewById(R.id.button22);
        buttons[22] = (Button) findViewById(R.id.button23);
        buttons[23] = (Button) findViewById(R.id.button24);
        buttons[24] = (Button) findViewById(R.id.button25);
        return buttons;
    }
}

