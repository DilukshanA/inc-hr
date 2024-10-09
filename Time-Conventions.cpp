#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

string timeConversion(string s) {
    string hourString = s.substr(0,2);
    string restofString = s.substr(2,6);
    string amOrPm = s.substr(8,2);
    
    int hour = stoi(hourString);
    
    if(amOrPm == "PM" && hour !=12){
        hour +=12;
    }
    else if (amOrPm == "AM" && hour == 12) {
        hour = 0;
    }
    stringstream ss;
    ss << setw(2)  << setfill('0') <<hour;
    hourString =ss.str();
    
    return hourString + restofString;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string result = timeConversion(s);

    fout << result << "\n";

    fout.close();

    return 0;
}
