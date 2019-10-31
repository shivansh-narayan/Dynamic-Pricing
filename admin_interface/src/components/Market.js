import React,{Component} from 'react';
import {Jumbotron,Button,Card,CardText,CardBody,CardTitle,Container,Row,Col,ListGroup,ListGroupItem} from 'reactstrap';
import axios from 'axios';
import Grocery from './Grocery.js';
import {ip} from './ip.js';
import './Market.css';

class Market extends Component {
  constructor(props){
    super(props);
  }
  render()
  {
          return (
            <div className="market">
                <Container>
                <Row>
                    <Col xs="3">
                    <h3>Shahdara</h3>
                          <Grocery marketName="Shahdara" grocerName="Gupta Grocers"></Grocery>
                          <Grocery marketName="Shahdara" grocerName="Sharma kirana"></Grocery>
                          <Grocery marketName="Shahdara" grocerName="Arvind Stores"></Grocery>
                    </Col>
                    <Col xs="3">
                    <h3>Keshopur</h3>
                          <Grocery marketName="Keshopur" grocerName="Hometown Gourmet"></Grocery>
                          <Grocery marketName="Keshopur" grocerName="Green and Fresh"></Grocery>
                          <Grocery marketName="Keshopur" grocerName="Able Market"></Grocery>
                    </Col>
                    <Col xs="3">
                    <h3>Azadpur</h3>
                          <Grocery marketName="Azadpur" grocerName="TheFarmStand"></Grocery>
                          <Grocery marketName="Azadpur" grocerName="The Farm Shop"></Grocery>
                          <Grocery marketName="Azadpur" grocerName="Farmopolis"></Grocery>
                    </Col>
                </Row>
                </Container>
            </div>
          );
  }
}
export default Market;