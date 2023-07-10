class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = ""

        for (index in db.indices) {
            if (db[index][0] == id_pw[0] && db[index][1] == id_pw[1]) {
                answer = "login"
                break
            } else if (db[index][0] == id_pw[0] && db[index][1] != id_pw[1]) {
                answer = "wrong pw"
                break
            } else if (db[index][1] == id_pw[1]) {
                answer = "fail"
            }
        }

        return answer
    }
}