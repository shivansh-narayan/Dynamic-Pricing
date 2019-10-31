import React,{Component} from 'react';
import {Jumbotron,Button,Card,CardText,CardBody,CardTitle,Container,Row,Col,ListGroup,ListGroupItem} from 'reactstrap';
import axios from 'axios';
import {ip} from './ip.js';

class Product extends Component{
    constructor(props){
        super(props);
    }
    render()
    {
        return(
            <div>
                <h6>{this.props.name}</h6>
                <p>Price: {this.props.price}</p>
                <p>Quantity: {this.props.quantity}</p>
            </div>
        );
    }
}

export default Product;