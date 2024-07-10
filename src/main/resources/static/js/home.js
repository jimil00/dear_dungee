// 뒤로가기 버튼 클릭 시 새로고침
window.onpageshow = function(event) {
    if(event.persisted) { // 뒤로가기
     location.reload(true); // 새로고침
    } else {
    console.log("새창");
    }
};
