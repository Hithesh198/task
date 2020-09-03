import React from 'react';
import {BrowserRouter ,Switch,Route } from 'react-router-dom';
import App from './App';    
import Overview from './Overview';
import Home from './Home';


const RouterDemo  =()=> {
    return(
        <div>
        <BrowserRouter>
        <div >
            <Route path="/"  exact component={Home} />
            <Route path="/app" exact component={App} />
            <Route path="/Overview" exact  component={Overview} />
        </div>
        </BrowserRouter>
        </div>
    );
}


export default RouterDemo;