import { useState } from "react";


export default function SearchBar(){
    const [query, setQuery] = useState('')

    function handleClick(){
        console.log(query);
    }

    return (
        <div className = "SearchBar">
            <label>Search</label>
            <input type = "Text" onChange = {e => setQuery(e.target.value)} />
            <button onClick={handleClick}>this is a button</button>
        </div>
    );

}