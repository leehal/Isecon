const Heading = (props) => {
  return <h1>{props.text}</h1>;
};

const Paragraph = (props) => {
  return <p>{props.text}</p>;
};

const Section = (props) => {
  return (
    <>
      <Heading text={props.title} />
      <Paragraph text={props.content} />
    </>
  );
};

export default Section;
