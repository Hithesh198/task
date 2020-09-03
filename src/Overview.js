import React from 'react';
import ListItems from './ListItems';
import App from './App';
function Overview(props){
    
    const items = props.items;
    const listItems = items.map(item =>
     {
       return <div className="list" key={item.key}>
    
                <input
                    type="text" id={item.key} 
                    value={item.text} 
                    onChange={(e)=>{
                    props.setUpdate(e.target.value,item.key)}}/>
                    </div>})
   
   return <div>{listItems}</div>}

export default Overview;