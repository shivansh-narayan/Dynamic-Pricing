import React,{Component} from 'react';
import './App.css';
import {Jumbotron,Button,Card,CardText,CardBody,CardTitle,Container,Row,Col,ListGroup,ListGroupItem} from 'reactstrap';
import {BrowserRouter as Router,Switch,Route,Link} from 'react-router-dom';
import Market from './components/Market.js';
import axios from 'axios';
import {ip} from './components/ip.js';



class App extends Component {
  constructor(props){
    super(props);
  }
  render()
  {
      return (
        <div className="App">
          <Jumbotron className="header" fluid>
            <h1 className="display-3">Grobasket</h1>
            <p className="lead">Admin Interface for Grobasket Android APP</p>
          </Jumbotron>
          <Container>
            <Row>
                <Market />
            </Row>
          </Container>
        </div>
      );
    }
}
export default App;