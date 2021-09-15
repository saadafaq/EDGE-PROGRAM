const initialState = {
    counter: 0
}

const reducer = (state = initialState, action) => {
    if (action.type === 'INCREMENT') {
        return {
            counter: state.counter + 1
        }
    }
    else if (action.type === 'DECREMENT') {
        return {
            counter: state.counter - 1
        }
    }
    else if (action.type === 'INCREMENTVALUE') {
        return {
            counter: state.counter + action.payload
        }
    }
    else if (action.type === 'DECREMENTVALUE') {
        return {
            counter: state.counter - action.payload
        }
    }
    
    return state;
};

export default reducer;