import React, { PureComponent } from 'react'
import ErrorImg from './Error.png'

class ErrorBoundary extends PureComponent {

  constructor(props){
    super(props)
    this.state = {
      hasError: false
    }
  }

  componentDidCatch (error, errorInfo){
    this.setState({
      hasError: true
    })
  }

  render() {
    if(this.state.hasError){
      return <img src={ErrorImg} />
    }
    return this.props.children 
  }
}

export default ErrorBoundary
