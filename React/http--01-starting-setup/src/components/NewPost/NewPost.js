import React, { useState } from 'react';
import './NewPost.css';


function NewPost2() {
    const [title, setTitle] = useState("");
    const [content, setContentt] = useState("");
    const [author, setAuthor] = useState("MAX");


    return (
        <div className="NewPost">
            <h1>Add a Post</h1>
            <label>Title</label>
            <input type="text" value={title} onChange={(event) => setTitle(event.target.value)} />
            <label>Content</label>
            <textarea rows="4" value={content} onChange={(event) => setContentt(event.target.value)} />
            <label>Author</label>
            <select value={author} onChange={(event) => setAuthor(event.target.value)}>
                <option value="Max">Max</option>
                <option value="Manu">Manu</option>
            </select>
            <button>Add Post</button>
        </div>
    );
}

export default NewPost2;