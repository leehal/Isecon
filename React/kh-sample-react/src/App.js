import "./App.css";

// JSX란 ? JavaScript에 XML을 추가 확장한 문법
// html 태그 사용 시 반드시 닫힘 태그가 존재해야 함.
// 컴포넌트가 반환 될때 태그는 한 개이어야 한다.
// 자바스크립트 코드를 중괄호를 사용해 데이터 바인딩 할 수 있음.
// 조건부 연산자 : {} 내에서 조건부 연산자 사용 가능
// 조건부 렌더링 : && 연산자의 특징을 활용해서 조건에 따라 화면 렌더링
// 인라인 스타알링 :
import Greeting from "./Greeting";
import Welcome from "./Welcome";
import Section from "./Section";
import MyComponent from "./MyComponent";

// 컴포넌트의 재활용

function App() {
  // return <Greeting />;
  return (
    <>
      <Section title="스포츠" content="오늘의 프로야구는 기아가 1등 입니다." />
      <Section title="정치" content="오늘은 영수 회담이 진행 중 입니다." />
      {/* <Welcome name="안유진" age={21} addr="서울시 강남구 역삼동" />
      <Welcome name="장원영" age={20} addr="서울시 강남구 청담동" />
      <Welcome name="레이" age={19} addr="서울시 강남구 삼성동" /> */}
      <hr />
      <MyComponent name="은채" age={20} />
      <MyComponent name="카즈하" />
      <MyComponent age={33} />
      <MyComponent>
        <h1>여기는 르세라핌 입니다.</h1>
      </MyComponent>
    </>
  );
}

export default App;
