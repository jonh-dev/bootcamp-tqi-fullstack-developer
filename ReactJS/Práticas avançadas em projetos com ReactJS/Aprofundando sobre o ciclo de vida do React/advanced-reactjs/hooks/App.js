import React, { PureComponent } from 'react'
import Twitter from './Twitter'


export default class App extends PureComponent {

  state = {
    loading: false,
    actived: true
  }

  componentDidMount() {
    setTimeout(() => {
      this.setState({
        loading: true
      })
    }, 3000)
  }

  onRemove = () => {
    this.setState({
      actived: false
    })
  }
  
  render() {

    const posts = [{
      title: 'xpto',
      description: 'foo'
    },{
      title: 'xpto',
      description: 'foo'

    }]
    

    return (
      <>
      <button onClick={this.onRemove}>Remover Componente</button>
      {this.state.actived &&(
      <Twitter posts={posts} loading={this.state.loading}/>
      )}
      </>
    )
  }
}
