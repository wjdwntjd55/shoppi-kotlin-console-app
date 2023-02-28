package screen

// ShoppingHome 에 있는 shoeCategories 내용들을 ShoppingCategory 으로 이동시킴
class ShoppingCategory {

     fun showCategories() {
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
            if (categories.contains(selectedCategory)) {
                // TODO 2. 카테고리 상품 목록 보여주기
            } else {
                showErrorMessage(selectedCategory)
            }


        }
    }

    // 카테고리 목록에 없는 값을 입력하는 경우
    private fun showErrorMessage(selectedCategory: String?) {
        println("[$selectedCategory] : 존재하지 않는 카테고리 입니다. 다시 입력해주세요")
        showCategories()
    }
}