<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>   
    
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>KULKKEOK KULKKEOK</title>
    <link rel="icon" href="resources/img/favicon.png">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <!-- animate CSS -->
    <link rel="stylesheet" href="resources/css/animate.css">
    <!-- owl carousel CSS -->
    <link rel="stylesheet" href="resources/css/owl.carousel.min.css">
    <!-- themify CSS -->
    <link rel="stylesheet" href="resources/css/themify-icons.css">
    <!-- flaticon CSS -->
    <link rel="stylesheet" href="resources/css/flaticon.css">
    <!-- fontawesome CSS -->
    <link rel="stylesheet" href="resources/fontawesome/css/all.min.css">
    <!-- magnific CSS -->
    <link rel="stylesheet" href="resources/css/magnific-popup.css">
    <link rel="stylesheet" href="resources/css/gijgo.min.css">
    <!-- niceselect CSS -->
    <link rel="stylesheet" href="resources/css/nice-select.css">
    <!-- slick CSS -->
    <link rel="stylesheet" href="resources/css/slick.css">
    <!-- style CSS -->
    <link rel="stylesheet" href="resources/css/style.css">
    
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script type="text/javascript">
    	$(function(){
    		$("#loginBtn").click(function(){
    			var user_id = $("#user_id").val();
    			var user_pw = $("#user_pw").val();
    			
    			if(user_id==""||user_pw==""){
    				alert("아이디와 비밀번호를 입력해주세요.");return false;
    			}
    			
    			var param = {
    					"user_id":user_id,
    					"user_pw":user_pw
    			};
    			
    			$.ajax({
    				type:"post",
    				url:"login.do",
    				data:JSON.stringify(param),
    				contentType:"application/json",
    				dataType:"json",
    				success:function(msg){
    					if(msg.check==true){
    						alert("로그인 성공");
    						location.href='main.do';
    					}else{
    						alert("아이디 및 비밀번호가 틀리셨습니다.");
    					}
    				},
    				error:function(){
    					alert("AJAX 통신실패");
    				}
    			});
    			
    			
    		});
    		
    		
    	});
    
    </script>
    
</head>

<body>
    <!--::header part start::-->
    <%@ include file="../header.jsp" %>
    <!-- Header part end-->

    <!-- login part start -->
        <section class="banner_part">
            <div class="container">
                <div class="row align-items-center justify-content-center">
                    <div class="section-top-border">
                        <div class="login" style="height: 500px;">
                            <h3 class="mb-30 login_logo">LOG IN</h3>
                            <form>
                            <input type="hidden" name="command" value="login">
                                <div class="mt-10 form-group">
                                    <input type="text" name="id" id="user_id" placeholder="ID" required class="form-control">
                                </div>
                                <div class="mt-10 form-group">
                                    <input type="password" name="pw" id="user_pw" placeholder="PASSWORD" required class="form-control">
                                </div>
                                
                                <input type="button" class="genric-btn primary radius" id="loginBtn" style="width:300px; margin-top: 15px;" value="LOGIN">
                                <br><br><br>
                                <!-- 네이버아이디로로그인 버튼 노출 영역 -->
								<div id="naverIdLogin"></div>
                                <!-- //네이버아이디로로그인 버튼 노출 영역 -->
                                
                                <br>
                                <a id="kakao-login-btn" ></a>
                                <hr>
                                
                                <div>
                                	<a href="#" class="form_botton_span" onclick="location.href='joinPage.do'">회원가입</a>
                                	<a href="#" class="form_botton_span" onclick="location.href='findIdPage.do'">아이디 찾기</a>
                                	<a href="#" class="form_botton_span" onclick="location.href='findPwPage.do'">비밀번호 찾기</a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    
    <!-- login part end -->
    
     <!-- 네이버 로그인 -->
    <script type="text/javascript" src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.0.js" charset="utf-8"></script>
    
    
								<!-- 네이버아이디로로그인 초기화 Script -->
								<script type="text/javascript">
									var naverLogin = new naver.LoginWithNaverId(
										{
											clientId: "2rgGm0EDyCztIN9m0foP",
											callbackUrl: "http://localhost:8787/KULKKEOK/callback.jsp",
											isPopup: false, 
											loginButton: {color: "green", type: 4, height: 48} /* 로그인 버튼의 타입을 지정 */
										}
									);
									
									naverLogin.init();
									
								</script>
								<!-- // 네이버아이디로로그인 초기화 Script -->
								
								
								
	<!-- 카카오톡 로그인 -->
    <script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>

								
								<!-- 카카오톡 아이디로로그인 초기화 Script -->
								<script type='text/javascript'>
							   //<![CDATA[
							    // 사용할 앱의 JavaScript 키를 설정해 주세요.
							    Kakao.init('a882bfbb712bc453a746c73aed7f06e7');  //여기서 아까 발급받은 키 중 javascript키를 사용해준다.
							    
							    // 카카오 로그인 버튼을 생성합니다.
							    Kakao.Auth.createLoginButton({
							      container: '#kakao-login-btn',
							      success: function(authObj) {
							           Kakao.API.request({
							               url: '/v2/user/me',
							               success: function(res) {
							            	  var id	= res.id;
							              	  var name	= res.properties.nickname != undefined ? res.properties.nickname : '이름없음';
							              	  var email	= res.kaccount_email;

							              	  location.href = "login.do?command=klogin&kid="+id+"&kname="+name;
							                   }
							                 })
							               },
							               fail: function(error) {
							                 alert(JSON.stringify(error));
							               }
							    });
							</script>
								<!-- // 카카오톡 아이디로로그인 초기화 Script -->


								    

    <!-- footer part start-->
    <%@ include file="../footer.jsp" %>
    <!-- footer part end-->

    <!-- jquery plugins here-->
    <script src="resources/js/jquery-1.12.1.min.js"></script>
    <!-- popper js -->
    <script src="resources/js/popper.min.js"></script>
    <!-- bootstrap js -->
    <script src="resources/js/bootstrap.min.js"></script>
    <!-- magnific js -->
    <script src="resources/js/jquery.magnific-popup.js"></script>
    <!-- swiper js -->
    <script src="resources/js/owl.carousel.min.js"></script>
    <!-- masonry js -->
    <script src="resources/js/masonry.pkgd.js"></script>
    <!-- masonry js -->
    <script src="resources/js/jquery.nice-select.min.js"></script>
    <script src="resources/js/gijgo.min.js"></script>
    <!-- contact js -->
    <script src="resources/js/jquery.ajaxchimp.min.js"></script>
    <script src="resources/js/jquery.form.js"></script>
    <script src="resources/js/jquery.validate.min.js"></script>
    <script src="resources/js/mail-script.js"></script>
    <script src="resources/js/contact.js"></script>
    <!-- custom js -->
    <script src="resources/js/custom.js"></script>
</body>

</html>