당근마켓 따라하기? 프로젝트

구현 목표 : MVVM 패턴, 구글 클린 아키텍쳐, 코루틴, JWT, Retrofit2, Singleton, LiveData, DataBinding, Jetpack Navigation, BottomNavigationView , Koin 사용

- 2022-06-30 : 프로젝트 재 생성 및 첫 커밋
- 2022-06-30 : 로그인 xml 화면 제작
  - 폰트 다운, 무료 당근 이미지 다운
  - id, password edittext drawable 제작 
---
- 2022-07-01 : 메인화면 제작 도입
  - 싱글 액티비티를 위한 Navigation Graph활용
  - bottom navigation 컴포넌트 사용 및 Navigation Graph와 연동
  - 배운점 : 바텀 네비 메뉴의 id와 네비 그래프의 id를 같게 하면 서로 연동이 됨
---
- 2022-07-03 : 클린 아키텍쳐 기반 MVVM 및 Koin Set Up
  - 할일이 굉장히 많은것 같다. data, domain, presentation 레이어로 나누고 또 그 안에서 여러 패키지와 클래스 파일을 만들었다.
  - 이게 끝이면 다행인데 Koin 때문에 더 복잡해져서 머리가 상당히 아프다. 더 열심히 공부해서 빨리 익혀야지
---
- 2022-07-04 : 상품 리스트 화면 제작 도입
  - RecyclerView, Floatting Action Button, Action Bar 이용
---
- 2022-07-05 : 상품 리스트 리사이클러 어댑터 & 스와이프 레이아웃 구현, 채팅 목록 화면 구현


##화면 구성

-            로그인 화면                             물품 리스트 화면       
- ![image](https://user-images.githubusercontent.com/68932465/176664428-3d4d9a9d-d4ef-4205-9ecf-3c7d12b87732.png)
      ![KakaoTalk_20220704_001503677](https://user-images.githubusercontent.com/68932465/177046198-187d445e-0e52-4962-8960-3e1cf4064cee.jpg)
-            채팅 목록 화면
- ![KakaoTalk_20220705_001715502](https://user-images.githubusercontent.com/68932465/177182874-ca6e3d14-0de1-4ec4-838d-923dc8d06e57.jpg)
