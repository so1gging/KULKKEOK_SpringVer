<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
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
</head>

<body>
    <!--::header part start::-->
    <%@ include file="../header.jsp" %>
    <!-- Header part end-->

    <!-- breadcrumb start-->
    <!-- breadcrumb start-->

    <!-- findPassword part start -->
        <section class="banner_part">
            <div class="container">
                <div class="row align-items-center justify-content-center">
                    <div class="section-top-border">
                        <div class="login">
                            <h3 class="mb-30">비밀번호 찾기</h3>
                            <form action="login.do" method="post" >
                            <input type="hidden" name="command" value="findPw">
                                <div class="mt-10 form-group">
                                    <input type="text" name="name" placeholder="이름을 입력하세요" required class="form-control">
                                </div>
                                <div class="mt-10 form-group">
                                    <input type="text" name="id" placeholder="아이디를 입력하세요" required class="form-control">
                                </div>
                                <div class="mt-10 form-group">
                                    <input type="email" name="email" placeholder="가입 시 등록한 이메일을 입력하세요" required class="form-control">
                                </div>
                                <input type="submit" class="genric-btn primary radius" style="width:300px; margin-top: 15px;" value="비밀번호 찾기"/>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    <!-- findPassword part end -->

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