package com.dev.dear_dungee.service;

import com.dev.dear_dungee.dao.MemberDAO;
import com.dev.dear_dungee.dto.MemberDTO;
import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

@Service
public class MemberService {

    @Autowired
    private MemberDAO dao;

    //coolSMS
    final DefaultMessageService messageService;
    public MemberService() {
        // 반드시 계정 내 등록된 유효한 API 키, API Secret Key를 입력해주셔야 합니다!
        this.messageService = NurigoApp.INSTANCE.initialize("NCSABSHUL0OKHIDY", "TAFW3P6ETYSZO8QQUNSPWJRSQ03J7QAJ", "https://api.coolsms.co.kr");
    }

    // 난수 인증번호 생성
    private String createRandomNumber() {
        Random rand = new Random();
        String randomNum = "";
        for (int i = 0; i < 6; i++) {
            String random = Integer.toString(rand.nextInt(10));
            randomNum += random;
        }

        return randomNum;
    }

    // 인증번호 전송
    public String sendSMS(String phone) {

        // 난수 인증번호 생성
        String randomNum = createRandomNumber();
        System.out.println("난수 인증번호 확인: " + randomNum);

        // 메세지 전송 정보 설정
        net.nurigo.sdk.message.model.Message message = new Message();
        // 발신번호 및 수신번호는 반드시 01012345678 형태로 입력되어야 합니다.
        message.setFrom("01056027047"); // 발신
        message.setTo(phone); // 수신
        message.setText("[dear.둥이] 인증번호는 " + "[" + randomNum + "]" + "입니다.");

        // 메세지 전송
        SingleMessageSentResponse response = this.messageService.sendOne(new SingleMessageSendingRequest(message));
        System.out.println("메세지 전송 확인: " + message.getText());

        return randomNum;

    }

    // 회원가입
    public void signup(MemberDTO dto) {

        //uuid 생성
        String member_id = UUID.randomUUID().toString();
        dto.setMember_id(member_id);

        dao.signup(dto);
    }

    // 로그인
    public boolean isLoginOk(String phone, String pw) {
        Map<String, String> param = new HashMap<>();
        param.put("phone", phone);
        param.put("pw", pw);

        return dao.isLoginOk(param);
    }

    //로그인 성공하면 id 값 가져와서 session 만들기
    public String selectIdByPhone(String phone) {
        return dao.selectIdByPhone(phone);
    }

    public MemberDTO selectMemberById(String member_id) {
        return dao.selectMemberById(member_id);
    }

}
