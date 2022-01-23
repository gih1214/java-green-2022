package jsonex01;

import com.google.gson.Gson;

class SmsDto {
    private String groupId;
    private int successCount;
    private int errorCount;

    public SmsDto(String groupId, int successCount, int errorCount) {
        this.groupId = groupId;
        this.successCount = successCount;
        this.errorCount = errorCount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }
}

public class GsonEx02 {
    public static void main(String[] args) {
        // {"group_id":"R2GdEONszq64lNB9","success_count":1,"error_count":0}
        String smsReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
        System.out.println(smsReturn);

        // Json -> JavaObject로 변경
        Gson gson = new Gson();
        SmsDto javaUserDto = gson.fromJson(smsReturn, SmsDto.class);
        System.out.println(javaUserDto.getGroupId());
        System.out.println(javaUserDto.getSuccessCount());
        System.out.println(javaUserDto.getErrorCount());

    }
}
