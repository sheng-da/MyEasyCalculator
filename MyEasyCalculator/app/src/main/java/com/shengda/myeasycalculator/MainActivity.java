package com.shengda.myeasycalculator;

/**
 * This app mimic the apple built-in calculator and using the android code to implment.
 */

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * The main class implement the all the operations for the calculator. I implement different
 * operation for each button and display the result value in the text view screen.
 *
 * For the implementation: I use a arraylist to implement a stack to store all the click
 * info and clean the stack and display the new result after each operation is finshed.
 * Using bigDecimal for all the number and calculation to avoid lost of precision caused by
 * float or double.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	private TextView displayScreen; // text view on the display screen.
	private List<clickInfo> clickInfoStack = new ArrayList<>(); // stack to store the click info
	private int lastClick = 0; // record the last click the user clicked.

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		displayScreen = (TextView) findViewById(R.id.displayScreen);

		findViewById(R.id.btn0).setOnClickListener(this);
		findViewById(R.id.btn1).setOnClickListener(this);
		findViewById(R.id.btn2).setOnClickListener(this);
		findViewById(R.id.btn3).setOnClickListener(this);
		findViewById(R.id.btn4).setOnClickListener(this);
		findViewById(R.id.btn5).setOnClickListener(this);
		findViewById(R.id.btn6).setOnClickListener(this);
		findViewById(R.id.btn6).setOnClickListener(this);
		findViewById(R.id.btn7).setOnClickListener(this);
		findViewById(R.id.btn8).setOnClickListener(this);
		findViewById(R.id.btn9).setOnClickListener(this);
		findViewById(R.id.btnClear).setOnClickListener(this);
		findViewById(R.id.btnSign).setOnClickListener(this);
		findViewById(R.id.btnPercentage).setOnClickListener(this);
		findViewById(R.id.btnDivide).setOnClickListener(this);
		findViewById(R.id.btnMultiple).setOnClickListener(this);
		findViewById(R.id.btnMinus).setOnClickListener(this);
		findViewById(R.id.btnPlus).setOnClickListener(this);
		findViewById(R.id.btnEqual).setOnClickListener(this);
		findViewById(R.id.btnDecimal).setOnClickListener(this);
	}

	public void onClick(View view) {
		try {
			/**
			 * If the last click is equal, do nothing but clean the stack.
			 */
			if (lastClick == R.id.btnEqual) {
				clickInfoStack.clear();
			}

			/**
			 * Store the current num on the display screen.
			 */
			String currentNum = displayScreen.getText().toString();

			/**
			 * Do different operation depends on the button user clicked.
			 */
			switch (view.getId()) {

			/**
			 * If the user click 0;
			 */
			case R.id.btn0:
				resetScreenForNum();
				currentNum = displayScreen.getText().toString();
				// if the number is negative
				if (currentNum.charAt(0) == '-') {

					if (currentNum.charAt(1) == '0' && !currentNum.contains(".")) {
						// if there is a leading 0 , do nothing
					} else { // append 0
						displayScreen.append("0");
					}
				} else {
					if (currentNum.charAt(0) == '0' && !currentNum.contains(".")) {
						// if there is a leading 0 , do nothing
					} else { // append 0
						displayScreen.append("0");
					}
				}
				break;

			/**
			 * Append the number if user click btn 1-9
			 */
			case R.id.btn1:		
				resetScreenForNum(); // clean the screen
				currentNum = displayScreen.getText().toString(); // reset the current number.
				// if there is leading zero, which means the number displayed is 0
				if (currentNum.charAt(0) == '0' && currentNum.length() == 1)
					displayScreen.setText("1");
				else if (currentNum.charAt(0) == '-' && currentNum.charAt(1) == '0' && currentNum.length() == 2)
					displayScreen.setText("-1");
				else
					displayScreen.append("1"); // add the number to the tail.
				break;

			case R.id.btn2:	
				resetScreenForNum();
				currentNum = displayScreen.getText().toString();
				if (currentNum.charAt(0) == '0' && currentNum.length() == 1)
					displayScreen.setText("2");
				else if (currentNum.charAt(0) == '-' && currentNum.charAt(1) == '0' && currentNum.length() == 2)
					displayScreen.setText("-2");
				else
					displayScreen.append("2");
				break;

			case R.id.btn3:
				resetScreenForNum();
				currentNum = displayScreen.getText().toString();
				if (currentNum.charAt(0) == '0' && currentNum.length() == 1)
					displayScreen.setText("3");
				else if (currentNum.charAt(0) == '-' && currentNum.charAt(1) == '0' && currentNum.length() == 2)
					displayScreen.setText("-3");
				else
					displayScreen.append("3");
				break;

			case R.id.btn4:
				resetScreenForNum();
				currentNum = displayScreen.getText().toString();
				if (currentNum.charAt(0) == '0' && currentNum.length() == 1)
					displayScreen.setText("4");
				else if (currentNum.charAt(0) == '-' && currentNum.charAt(1) == '0' && currentNum.length() == 2)
					displayScreen.setText("-4");
				else
					displayScreen.append("4");
				break;

			case R.id.btn5:
				resetScreenForNum();
				currentNum = displayScreen.getText().toString();
				if (currentNum.charAt(0) == '0' && currentNum.length() == 1)
					displayScreen.setText("5");
				else if (currentNum.charAt(0) == '-' && currentNum.charAt(1) == '0' && currentNum.length() == 2)
					displayScreen.setText("-5");
				else
					displayScreen.append("5");
				break;

			case R.id.btn6:
				resetScreenForNum();
				currentNum = displayScreen.getText().toString();
				if (currentNum.charAt(0) == '0' && currentNum.length() == 1)
					displayScreen.setText("6");
				else if (currentNum.charAt(0) == '-' && currentNum.charAt(1) == '0' && currentNum.length() == 2)
					displayScreen.setText("-6");
				else
					displayScreen.append("6");
				break;

			case R.id.btn7:
				resetScreenForNum();
				currentNum = displayScreen.getText().toString();
				if (currentNum.charAt(0) == '0' && currentNum.length() == 1)
					displayScreen.setText("7");
				else if (currentNum.charAt(0) == '-' && currentNum.charAt(1) == '0' && currentNum.length() == 2)
					displayScreen.setText("-7");
				else
					displayScreen.append("7");
				break;

			case R.id.btn8:
				resetScreenForNum();
				currentNum = displayScreen.getText().toString();
				if (currentNum.charAt(0) == '0' && currentNum.length() == 1)
					displayScreen.setText("8");
				else if (currentNum.charAt(0) == '-' && currentNum.charAt(1) == '0' && currentNum.length() == 2)
					displayScreen.setText("-8");
				else
					displayScreen.append("8");
				break;

			case R.id.btn9:
				resetScreenForNum();
				currentNum = displayScreen.getText().toString();
				if (currentNum.charAt(0) == '0' && currentNum.length() == 1)
					displayScreen.setText("9");
				else if (currentNum.charAt(0) == '-' && currentNum.charAt(1) == '0' && currentNum.length() == 2)
					displayScreen.setText("-9");
				else
					displayScreen.append("9");
				break;

			/**
			 * reset the screen to 0
			 */
			case R.id.btnClear:
				displayScreen.setText("0");
				clickInfoStack.clear();
				break;
			/**
			 * Change the sign bit.
			 */
			case R.id.btnSign:
				if (currentNum.charAt(0) != '-')
					displayScreen.setText("-".concat(currentNum));
				else {
					displayScreen.setText(currentNum.substring(1));
				}
				break;

			/**
			 * Divide the current number by 100
			 */
			case R.id.btnPercentage:
				BigDecimal num = new BigDecimal(currentNum);
				num.divide(new BigDecimal("100"));
				// Double num = Double.valueOf(currentNum) / 100;
				displayScreen.setText(num.toString());
				break;

			/**
			 * Add a decimal point to the number on the screen.
			 */
			case R.id.btnDecimal:
				if (!currentNum.contains("."))
					displayScreen.setText(currentNum.concat("."));
				break;

			/**
			 * The add new elements into the stack only by push the operator and
			 * equal button.
			 */

			/**
			 * If the last click was not an operator button, do the coputation
			 * follow the rules: 1.If stack is empty: push the discreen value
			 * and operator into the stack. 2.If the stack has only one element:
			 * The one element must be number, only push the operator into the
			 * stack 3.If the stack has two elements: push the screen value to
			 * the stack, do the computation, and push the operator into stack
			 * after computation. Display the value at the last
			 */
			case R.id.btnDivide:
				if (lastClick != R.id.btnMultiple && lastClick != R.id.btnDivide && lastClick != R.id.btnMinus
						&& lastClick != R.id.btnPlus) {

					if (clickInfoStack.isEmpty()) {
						// if stack is empty simple push screen value and
						// operator
						clickInfoStack.add(
								new clickInfo(new BigDecimal(displayScreen.getText().toString()), DataType.NUM));
						clickInfoStack.add(new clickInfo(DataType.DIVIDE));
					} else if (clickInfoStack.size() == 1) {
						// if stack size > 1 (at least two elements (1 element 1
						// operater))
						clickInfoStack.add(new clickInfo(DataType.DIVIDE));

					} else if (clickInfoStack.size() == 2) {
						// push the screen value and operator - > binary
						// equation caculate and push the operator
						clickInfoStack.add(
								new clickInfo(new BigDecimal(displayScreen.getText().toString()), DataType.NUM));
						computeClickInfo();
						clickInfoStack.add(new clickInfo(DataType.DIVIDE));
						displayScreen.setText(clickInfoStack.get(0).value.toString() + "");
					}
				}
				break;

			case R.id.btnMultiple:
				if (lastClick != R.id.btnMultiple && lastClick != R.id.btnDivide && lastClick != R.id.btnMinus
						&& lastClick != R.id.btnPlus) {
					if (clickInfoStack.isEmpty()) {
						clickInfoStack.add(
								new clickInfo(new BigDecimal(displayScreen.getText().toString()), DataType.NUM));
						clickInfoStack.add(new clickInfo(DataType.MULTIPLY));
					} else if (clickInfoStack.size() == 1) {
						clickInfoStack.add(new clickInfo(DataType.MULTIPLY));
					} else if (clickInfoStack.size() == 2) {
						clickInfoStack.add(
								new clickInfo(new BigDecimal(displayScreen.getText().toString()), DataType.NUM));
						computeClickInfo();
						clickInfoStack.add(new clickInfo(DataType.MULTIPLY));
						displayScreen.setText(clickInfoStack.get(0).value.toString() + "");
					}
				}
				break;

			case R.id.btnMinus:
				if (lastClick != R.id.btnMultiple && lastClick != R.id.btnDivide && lastClick != R.id.btnMinus
						&& lastClick != R.id.btnPlus) {
					if (clickInfoStack.isEmpty()) {
						clickInfoStack.add(
								new clickInfo(new BigDecimal(displayScreen.getText().toString()), DataType.NUM));
						clickInfoStack.add(new clickInfo(DataType.MINUS));
					} else if (clickInfoStack.size() == 1) {
						clickInfoStack.add(new clickInfo(DataType.MINUS));
					} else if (clickInfoStack.size() == 2) {
						clickInfoStack.add(
								new clickInfo(new BigDecimal(displayScreen.getText().toString()), DataType.NUM));
						computeClickInfo();
						clickInfoStack.add(new clickInfo(DataType.MINUS));
						displayScreen.setText(clickInfoStack.get(0).value.toString() + "");
					}
				}
				break;

			case R.id.btnPlus:
				if (lastClick != R.id.btnMultiple && lastClick != R.id.btnDivide && lastClick != R.id.btnMinus
						&& lastClick != R.id.btnPlus) {
					if (clickInfoStack.isEmpty()) {
						clickInfoStack.add(
								new clickInfo(new BigDecimal(displayScreen.getText().toString()), DataType.NUM));
						clickInfoStack.add(new clickInfo(DataType.ADD));
					} else if (clickInfoStack.size() == 1) {
						clickInfoStack.add(new clickInfo(DataType.ADD));
					} else if (clickInfoStack.size() == 2) {
						clickInfoStack.add(
								new clickInfo(new BigDecimal(displayScreen.getText().toString()), DataType.NUM));
						computeClickInfo();
						clickInfoStack.add(new clickInfo(DataType.ADD));
						displayScreen.setText(clickInfoStack.get(0).value.toString() + "");
					}
				}
				break;

				/**
				 * The equal method still can not do the continuous adding, substracting,dividing
				 * and mutiplying. e.g: 1 + 1 = = = = should return 5 but this version will do
				 * nothing after the first equal is clicked.
				 *
 				 */
				case R.id.btnEqual:
				if (lastClick != R.id.btnMultiple && lastClick != R.id.btnDivide && lastClick != R.id.btnMinus
						&& lastClick != R.id.btnPlus) {
					{
						// show on the screen, clear the stack
						clickInfoStack.add(
								new clickInfo(new BigDecimal(displayScreen.getText().toString()), DataType.NUM));
						computeClickInfo_Equal();
					}
					break;
				}
			}
		} catch (Exception e) {
			// this is a lazy version of exception control,just catch exception and show on the screen
			displayScreen.setText(e.getMessage());
		}
		lastClick = view.getId(); // update the last click.
	}

	/**
	 * Reset the screen for new number input. If the last click was any operator
	 * or equal button, set the text to 0 to reset.
	 */
	public void resetScreenForNum() {
		if (lastClick == R.id.btnMultiple || lastClick == R.id.btnDivide || lastClick == R.id.btnMinus
				|| lastClick == R.id.btnPlus || lastClick == R.id.btnEqual) {
			displayScreen.setText("0");
		}
	}

	/**
	 * The compute click info computes or update the click info stored in the current stack.
	 * TODO: this method need to be merged with computeClickInfo_Equal method in the future.
	 */
	public void computeClickInfo() {
		BigDecimal a = clickInfoStack.get(0).value;
		if (clickInfoStack.size() >= 3) {

			BigDecimal b = clickInfoStack.get(2).value;
			int operator = clickInfoStack.get(1).type;
			clickInfoStack.clear();

			switch (operator) {
			case DataType.ADD:
				clickInfoStack.add(new clickInfo(a.add(b), DataType.NUM));
				break;
			case DataType.MINUS:
				clickInfoStack.add(new clickInfo(a.subtract(b), DataType.NUM));
				break;
			case DataType.DIVIDE:
				clickInfoStack.add(new clickInfo(a.divide(b,15,BigDecimal.ROUND_HALF_DOWN), DataType.NUM));
				break;
			case DataType.MULTIPLY:
				clickInfoStack.add(new clickInfo(a.multiply(b), DataType.NUM));
				break;
			default:
				break;

			}
		} else {
			clickInfoStack.clear();
			clickInfoStack.add(new clickInfo(a, DataType.NUM));
		}

	}

	/**
	 * The computeClickInfo_Equal methods computes or update the click info stored in the
	 * current stack. And clean the stack. (work only for equal button)
	 */
	public void computeClickInfo_Equal() {

		if (clickInfoStack.size() >= 3) {

			BigDecimal a = clickInfoStack.get(0).value;
			BigDecimal b = clickInfoStack.get(2).value; // add value
			int operator = clickInfoStack.get(1).type;

			switch (operator) {
			case DataType.ADD:
				clickInfoStack.set(0, new clickInfo(a.add(b), DataType.NUM));
				displayScreen.setText(clickInfoStack.get(0).value.toString() + "");
				break;
			case DataType.MINUS:
				clickInfoStack.set(0, new clickInfo(a.subtract(b), DataType.NUM));
				displayScreen.setText(clickInfoStack.get(0).value.toString() + "");
				break;
			case DataType.DIVIDE:
				clickInfoStack.set(0, new clickInfo(a.divide(b,15,BigDecimal.ROUND_HALF_DOWN), DataType.NUM));
				displayScreen.setText(clickInfoStack.get(0).value.toString() + "");
				break;
			case DataType.MULTIPLY:
				clickInfoStack.set(0, new clickInfo(a.multiply(b), DataType.NUM));
				displayScreen.setText(clickInfoStack.get(0).value.toString() + "");
				break;
			default:
				break;
			}
		}
		clickInfoStack.clear();
	}
}
