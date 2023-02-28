package screen

// 실습 3-1. 역할 분리, 가독성 높이기
// Step 1. Main 에 있는 코드들을 함수 start() 에 모두다 넣음
class ShoppingHome {

    fun start() {

        // Step 2. 화면별 클래스 분리
        showWelcomeMessage()
        shoeCategories()
    }

    // 원하는 부분을 드래그후 마우스 우클릭
    // Refactor -> Function.. 을 클릭한뒤 함수이름 지정하면 자동으로 함수선언됨
    private fun showWelcomeMessage() {
        // 실습 1. 사용자 정보 저장하고 출력하기

        // Step 1. 인사말 출력
        println("안녕하세요. Shoppi 에 오신 것을 환영합니다!")
        println("쇼핑을 계속 하시려면 이름을 입력해주세요 :)")

        // Step 2. 사용자 이름받기
        val name = readln()

        // Step 3. 입력 받은 사용자 이름 출력
        println(
            """
            감사합니다. 반갑습니다, $name 님
            원하시는 카테고리를 입력해주세요.
            ***============================***
            """.trimIndent()
        )
    }

    private fun shoeCategories() {
        // 실습 2. 선택메뉴 표기와 사용자 입력 처리

        // Step 1. 상품 카테고리 표기
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        for (category in categories) {
            println(category)
        }
        println("=> 장바구니로 이동하시려면 # 을 입력해주세요")

        // Step 2. 사용자 입력 받기
        // readLine() : Nullable StringType 을 반환해준다
        var selectedCategory = readLine()

        // Step 3. 사용자가 기대하는 값을 입력하지 않는 경우에 대한 처리
        // isNullOrBlank : null이거나 blank 상황이 둘 다 아닐 때 true를 리턴한다.
        while (selectedCategory.isNullOrBlank()) {
            println("값을 입력해주세요")
            selectedCategory = readLine()
        }
        if (selectedCategory == "#") {
            // TODO 1. 장바구니 이동
        } else {
            // TODO 2. 카테고리 상품 목록 보여주기
            // TODO 3. 카테고리 목록에 없는 값을 입력하는 경우
        }
    }


}