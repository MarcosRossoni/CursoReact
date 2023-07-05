import styles from './Container.modules.css'

function Container(props) {
    return (
        <div className={`${props.container} ${props.customClass}`}>
            {props.children}
        </div>
    )
}

export default Container