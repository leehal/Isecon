const Welcome = (props) => {
  return (
    <>
      <h2>제 이름은 {props.name}이고,</h2>
      <h2>나이는 {props.age}살</h2>
      <h2>주소는 {props.addr}입니다.</h2>
    </>
  );
};

export default Welcome;
