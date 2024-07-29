package com.dev.dear_dungee.controller;

import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message/")
public class MessageController {

    final DefaultMessageService messageService;

    public MessageController() {
        // 반드시 계정 내 등록된 유효한 API 키, API Secret Key를 입력해주셔야 합니다!
        this.messageService = NurigoApp.INSTANCE.initialize("NCSABSHUL0OKHIDY", "TAFW3P6ETYSZO8QQUNSPWJRSQ03J7QAJ", "https://api.coolsms.co.kr");
    }

    /**
     * 단일 메시지 발송 예제
     */
    @RequestMapping("send")
    public SingleMessageSentResponse sendOne(String phone) {
        Message message = new Message();
        // 발신번호 및 수신번호는 반드시 01012345678 형태로 입력되어야 합니다.
        message.setFrom("01056027047"); // 발신
        message.setTo(phone); // 수신
        message.setText("테스트");

        SingleMessageSentResponse response = this.messageService.sendOne(new SingleMessageSendingRequest(message));

        System.out.println("메세지 확인: " + message.getText());

        return response;
    }
}
