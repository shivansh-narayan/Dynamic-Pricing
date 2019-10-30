import React,{Component} from 'react';
import {Jumbotron,Button,Card,CardText,CardBody,CardTitle,Container,Row,Col} from 'reactstrap';
import {Link} from 'react-router-dom';

class Home extends Component {
  render()
  {
    return (
      <div className="Home">
        <h2 className="text-center">Markets</h2>
        <Container>
          <Row>
            <Col>
              <Card>
                <CardTitle>Azadpur</CardTitle>
                <Link to="/markets/Azadpur"><Button>Get Products</Button></Link>
              </Card>
            </Col>
            <Col>
              <Card>
                <CardTitle><h3>Saharpur</h3></CardTitle>
                <Button>Get Products</Button>
              </Card>
            </Col>
            <Col>
              <Card>
                <CardTitle>Saharpur</CardTitle>
                <Button>Get Products</Button>
              </Card>
            </Col>
          </Row>
        </Container>
      </div>
    );
  }
}
export default Home;