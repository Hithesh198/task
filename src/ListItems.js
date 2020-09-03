import React from 'react';
import './ListItems.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import FlipMove from 'react-flip-move';

import { makeStyles } from '@material-ui/core/styles';
import Fab from '@material-ui/core/Fab';
import EditIcon from '@material-ui/icons/Edit';
import Overview from './Overview';

function ListItems(props){
    const items = props.items;
    const listItems = items.map(item =>
     {
       return <div className="list" key={item.key}>
     <p>
         <span>
        <Fab color="secondary" aria-label="edit" style={{ fontSize: 5 }}>
         <span>
                <input
                    type="text" id={item.key} 
                    value={item.text} 
                    onChange={(e)=>{
                    props.setUpdate(e.target.value,item.key)}}/>
             </span> 
                     <EditIcon style={{ fontSize: 35 }}/>              
              </Fab>
              </span>
        <span>
        <FontAwesomeIcon className="faicons" onClick={() => {
            props.deleteItem(item.key)
        }} icon="trash" />
        </span>
     </p>
    </div>})
    return <div>
        <FlipMove duration={300} easing="ease-in-out">
        {listItems}
        </FlipMove>
    </div>
  }

export default ListItems;