package app.my.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import app.my.mycalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"1");
            }
        });
        binding.b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"2");
            }
        });
        binding.b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"3");
            }
        });
        binding.b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"4");
            }
        });
        binding.b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"5");
            }
        });
        binding.b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"6");
            }
        });
        binding.b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"7");
            }
        });
        binding.b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"8");
            }
        });
        binding.b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"9");
            }
        });
        binding.b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"0");
            }
        });
        binding.bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+".");
            }
        });
        binding.bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText("");
                binding.tvsec.setText("");
            }
        });
        binding.bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.tvmain.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Already Cleared!", Toast.LENGTH_SHORT).show();
                }
                else {
                    String val = binding.tvmain.getText().toString();
                    val  = val.substring(0, val.length() - 1);
                    binding.tvmain.setText(val);
                }
            }
        });
        binding.bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"+");
            }
        });
        binding.bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"-");
            }
        });
        binding.bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"÷");
            }
        });
        binding.bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"×");
            }
        });
        binding.bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.tvmain.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter some value first!", Toast.LENGTH_SHORT).show();
                }
                else {
                    String val = binding.tvmain.getText().toString();
                    double r = Math.sqrt(Double.parseDouble(val));
                    binding.tvmain.setText(String.valueOf(r));
                }
            }
        });
        binding.bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"(");
            }
        });
        binding.bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+")");
            }
        });
        binding.bpie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvsec.setText(binding.bpie.getText());
                binding.tvmain.setText(binding.tvmain.getText()+pi);
            }
        });
        binding.bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"sin");
            }
        });
        binding.bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"cos");
            }
        });
        binding.btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"tan");
            }
        });
        binding.binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.tvmain.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter some value first!", Toast.LENGTH_SHORT).show();
                }
                else {
                    binding.tvmain.setText(binding.tvmain.getText()+"^"+"(-1)");
                }
            }
        });
        binding.bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.tvmain.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter some value first!", Toast.LENGTH_SHORT).show();
                }
                else {
                    int val = Integer.parseInt(binding.tvmain.getText().toString());
                    int fact = factorial(val);
                    binding.tvmain.setText(String.valueOf(fact));
                    binding.tvsec.setText(val+"!");
                }
            }
        });
        binding.bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.tvmain.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter some value first!", Toast.LENGTH_SHORT).show();
                }
                else {
                    double d = Double.parseDouble(binding.tvmain.getText().toString());
                    double square = d*d;
                    binding.tvmain.setText(String.valueOf(square));
                    binding.tvsec.setText(d+"²");
                }
            }
        });
        binding.bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"ln");
            }
        });
        binding.blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvmain.setText(binding.tvmain.getText()+"log");
            }
        });
        binding.bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.tvmain.getText().toString().isEmpty()){
                    binding.tvmain.setText(null);
                }
                else {
                    String val = binding.tvmain.getText().toString();
                    String replacedstr = val.replace('÷','/').replace('×','*');
                    double result = eval(replacedstr);
                    binding.tvmain.setText(String.valueOf(result));
                    binding.tvsec.setText(val);
                }

            }
        });
    }

    int factorial(int n){
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}