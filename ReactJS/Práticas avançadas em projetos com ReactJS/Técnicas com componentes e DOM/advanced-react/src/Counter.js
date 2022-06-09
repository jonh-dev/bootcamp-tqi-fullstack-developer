import React, { PureComponent } from 'react'

export class Counter extends PureComponent {
  
  constructor(props){
    super(props)
    this.state = {
      count: 0
    }
  }

  increment = () => {
    const { count } = this.state
    this.setState({
      count: count + 1
    })
  }

  decrement = () => {
    const { count } = this.state
    this.setState ({
      count: count - 1
    })
  }

    render() {

      const { render } = this.props
      const { decrement, increment, count } = this.state
      return (
        <div>
      {
        render({
          increment: this.increment,
          decrement: this.decrement,
          count
        })
      }
        </div>
    )
  }
}

export default Counter