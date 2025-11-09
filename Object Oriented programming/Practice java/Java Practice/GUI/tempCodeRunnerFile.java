else if (event.getSource() == bEqual) {
            double result = 0;
            String temp = tfAnswer.getText();
            int l = temp.length();
            int SI = 0;    //start index
            String s[] = new String[15];
            char c[] = new char[15];

            if (temp.charAt(0) == '*' || (temp.charAt(l - 1) == '*' || temp.charAt(l - 1) == '-' || temp.charAt(l - 1) == '-')) {
                tfAnswer.setText("Math Error");
            } else {
                for (int i = 0; i < l - 1; i++) {

                    if ((temp.charAt(i) == '*' || temp.charAt(i) == '+' || temp.charAt(i) == '-')
                            && (temp.charAt(i + 1) == '*' || temp.charAt(i + 1) == '+' || temp.charAt(i + 1) == '-')) {
                        tfAnswer.setText("Math Error");
                    } else if (temp.charAt(0 + i) == '*' || temp.charAt(0 + i) == '+' || temp.charAt(0 + i) == '-') {

                        c[i] = temp.charAt(i);
                        s[i] = temp.substring(SI, i);

                        SI = i + 1;

                        System.out.println(s[i]);
                        System.out.println(c[i]);
                    }

                }   // loop end
                s[l - 1] = temp.substring(SI); // store last number
                System.out.println(s[l - 1]);

                double num1 = Double.parseDouble(s[0]);

                for (int i = 0; i < l - 1; i++) {
                    double num2 = Double.parseDouble(s[i + 1]);
                    switch (c[i]) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                    }
                    num1 = result;
                }

                System.out.println(result);
                tfAnswer.setText(result + "");
            }
        } 