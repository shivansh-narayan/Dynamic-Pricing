import React,{Component} from 'react';
import {Jumbotron,Button,Card,CardText,CardBody,CardTitle,Container,Row,Col,ListGroup,ListGroupItem} from 'reactstrap';
import Product from './Product.js';
import axios from 'axios';
import {ip} from './ip.js';

let pstyle = {
    align: 'center',
}

class Grocery extends Component{
    constructor(props){
        super(props);
        this.state = {
            products: [{
                name: '',
                quantity: 0,
                price: 0,
                market: '',
                grocer: '',
            },
            {
                name: '',
                quantity: 0,
                price: 0,
                market: '',
                grocer: '',
            },
            {
                name: '',
                quantity: 0,
                price: 0,
                market: '',
                grocer: '',
            },
            {
                name: '',
                quantity: 0,
                price: 0,
                market: '',
                grocer: '',
            },
        ]
        }
        this.getData = this.getData.bind(this);
    }
    componentDidMount(){
        setInterval(()=> this.getData(),5000);
    }
    getData(){
        axios.get(ip+"/deats/products?groceryName="+this.props.grocerName+"&marketName="+this.props.marketName).then(response => this.setState({products: response.data.ans}))
    }
      render()
      {
        return (
          <div className="grocer" style={{margin: 50,alignContent: 'center',alignText:'center'}}>
              <h6 style={{leftmargin: 150}}>{this.props.grocerName}</h6>
              <Col>
                  <ListGroup style={{leftmargin: 100,rightmargin: 50, alignText: 'center'}}>
                    <ListGroupItem style={{width: 200,height: 120}}>
                        <Product name={this.state.products[0].name} quantity={this.state.products[0].quantity} price={this.state.products[0].price}></Product>
                    </ListGroupItem>
                    <ListGroupItem style={{width: 200,height: 120}}>
                        <Product name={this.state.products[1].name} quantity={this.state.products[1].quantity} price={this.state.products[1].price}></Product>
                    </ListGroupItem>
                    <ListGroupItem style={{width: 200,height: 120}}> 
                        <Product name={this.state.products[2].name} quantity={this.state.products[2].quantity} price={this.state.products[2].price}></Product>
                    </ListGroupItem>
                    <ListGroupItem style={{width: 200,height: 120}}>
                        <Product name={this.state.products[3].name} quantity={this.state.products[3].quantity} price={this.state.products[3].price}></Product>
                    </ListGroupItem>
                  </ListGroup>
                  </Col>
          </div>
        );
      }
}

export default Grocery;