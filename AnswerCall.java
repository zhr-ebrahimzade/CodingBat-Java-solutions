public class AnswerCall {
    public boolean answerCall(boolean isMorning , boolean isMom , boolean isAsleep){
        if (isAsleep)
            return false;
        if (isMom)
            return true;
        return (!isMorning);

    }
}
