package programmers.kakao_blind_recruitment_2021;

public class 신규아이디추천 {
    public static int MAX_LENGTH = 16;
    public static int MIN_LENGTH = 2;

    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase(); // stage1
        answer = answer.replaceAll("[^a-z0-9._-]", ""); //stage2
        answer = removeConsecutiveDots(answer); //stage3
        answer = removeFirstOrLastDot(answer); //stage4
        answer = checkIsBlank(answer); //stage5
        answer = checkIsCorrectLength(answer); //stage6,7
        return answer;
    }

    private String checkIsCorrectLength(String answer) {
        StringBuffer result = new StringBuffer(answer);
        if (MAX_LENGTH <= answer.length()) {
            result = new StringBuffer(answer.substring(0, MAX_LENGTH - 1));
            while (result.charAt(result.length() - 1) == '.') {
                result.deleteCharAt(result.length() - 1);
            }
        }

        while (result.length() <= MIN_LENGTH) {
            result.append(result.charAt(result.length() - 1));
        }

        return result.toString();
    }

    private String checkIsBlank(String answer) {
        if (answer.isBlank()) {
            answer = "a";
        }
        return answer;
    }

    private String removeFirstOrLastDot(String answer) {
        if (answer.length() == 1 && answer.charAt(0) == '.') {
            return "";
        }

        StringBuffer result = new StringBuffer(answer);
        if (result.indexOf(".") == 0) {
            result.deleteCharAt(0);
        }

        if (result.lastIndexOf(".") == result.length() - 1) {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }

    private String removeConsecutiveDots(String answer) {
        StringBuffer result = new StringBuffer();
        boolean isConsecutive = false;
        for (char c : answer.toCharArray()) {
            if (c == '.') {
                if (isConsecutive) {
                    continue;
                }
                isConsecutive = true;
            } else {
                isConsecutive = false;
            }
            result.append(c);
        }
        return result.toString();
    }

}
