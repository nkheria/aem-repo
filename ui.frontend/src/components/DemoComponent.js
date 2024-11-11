import React from 'react';
import {MapTo} from '@adobe/aem-react-editable-components';
import ReactWeather, { useOpenWeather} from 'reacy-open-weather';

const API_KEY = 'f6da918e17fbb15c125e6a794412e7a4';

const OpenweatherEditConfog = {

    emptyLabel: 'Weather',
    isEmpty: function(props) {
        return !props || !props.lat || !props.lon || !props.label;
    }
};

function ReactWeatherWrapper(props) {
    const {data, isLoading, errorMessage } = useOpenWeather({
        key: API_KEY,
        lat: props.lat,
        lon: props.lon,
        lang: 'en',
        unit: 'imperial'
    });

    return (
        <div classname="cmp-open-weather">
            <ReactWeather
                isLoading={isLoading}
                errorMessage={errorMessage}
                data={data}
                localLabel={props.label}
                unitslabels={{ temperature: 'F', windpseed: 'mph'}}
                showForecast={false}
            />
        </div>
    )
}

export default function OpenWeather(props) {
    if (OpenWeatherConfig.isEmpty(props)) {
        return null;
    }

    return ReactWeatherWrapper(props);
}

MapTo('mysite/component/DemoComponet')