import styles from './Message.module.css'
import {useEffect, useState} from "react";
import {clear} from "@testing-library/user-event/dist/clear";

function Message({type, msg}) {

    const [visible, setVisible] = useState(false)

    useEffect(() => {

        if (!msg) {
            setVisible(false)
            return
        }

        setVisible(true)

        const timer = setTimeout(() => {
            setVisible(false)
        }, 3000)

        return () => clear(timer);
    })


    return (
        <>
            {visible && (
                <div className={`${styles.message} ${styles[type]}`}>{msg}</div>
            )}
        </>
    )
}

export default Message