#include <string>
#include <iostream>
#include <regex>
#include <vector>

using namespace std;

string solution(string new_id) {
    string answer ="";
    
    for (char &ch : new_id)
        ch = tolower(ch);
    
    answer = regex_replace(new_id, regex("[^a-z0-9\\-_.]"), "");
    
    answer = regex_replace(answer, regex("\\.+"), ".");

    answer = regex_replace(answer, regex("^[.]|[.]$"), "");

    if (answer.empty()) 
        answer = "a";

    if (answer.size() > 15){
        answer = answer.substr(0, 15);
        answer = regex_replace(answer, regex("[.]$"), "");
    }
    
    while (answer.size() < 3) 
        answer += answer.back();
    
    return answer;
}