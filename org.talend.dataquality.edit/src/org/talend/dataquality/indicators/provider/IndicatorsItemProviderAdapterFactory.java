/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.talend.dataquality.indicators.util.IndicatorsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IndicatorsItemProviderAdapterFactory extends IndicatorsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IndicatorsItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.Indicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IndicatorItemProvider indicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.Indicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createIndicatorAdapter() {
        if (indicatorItemProvider == null) {
            indicatorItemProvider = new IndicatorItemProvider(this);
        }

        return indicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.RowCountIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RowCountIndicatorItemProvider rowCountIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.RowCountIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRowCountIndicatorAdapter() {
        if (rowCountIndicatorItemProvider == null) {
            rowCountIndicatorItemProvider = new RowCountIndicatorItemProvider(this);
        }

        return rowCountIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.SumIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SumIndicatorItemProvider sumIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.SumIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSumIndicatorAdapter() {
        if (sumIndicatorItemProvider == null) {
            sumIndicatorItemProvider = new SumIndicatorItemProvider(this);
        }

        return sumIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.CompositeIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CompositeIndicatorItemProvider compositeIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.CompositeIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCompositeIndicatorAdapter() {
        if (compositeIndicatorItemProvider == null) {
            compositeIndicatorItemProvider = new CompositeIndicatorItemProvider(this);
        }

        return compositeIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.RangeIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RangeIndicatorItemProvider rangeIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.RangeIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRangeIndicatorAdapter() {
        if (rangeIndicatorItemProvider == null) {
            rangeIndicatorItemProvider = new RangeIndicatorItemProvider(this);
        }

        return rangeIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.BoxIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BoxIndicatorItemProvider boxIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.BoxIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createBoxIndicatorAdapter() {
        if (boxIndicatorItemProvider == null) {
            boxIndicatorItemProvider = new BoxIndicatorItemProvider(this);
        }

        return boxIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.IndicatorType} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IndicatorTypeItemProvider indicatorTypeItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.IndicatorType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createIndicatorTypeAdapter() {
        if (indicatorTypeItemProvider == null) {
            indicatorTypeItemProvider = new IndicatorTypeItemProvider(this);
        }

        return indicatorTypeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.IntegerSumIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntegerSumIndicatorItemProvider integerSumIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.IntegerSumIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createIntegerSumIndicatorAdapter() {
        if (integerSumIndicatorItemProvider == null) {
            integerSumIndicatorItemProvider = new IntegerSumIndicatorItemProvider(this);
        }

        return integerSumIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.DoubleSumIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DoubleSumIndicatorItemProvider doubleSumIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.DoubleSumIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDoubleSumIndicatorAdapter() {
        if (doubleSumIndicatorItemProvider == null) {
            doubleSumIndicatorItemProvider = new DoubleSumIndicatorItemProvider(this);
        }

        return doubleSumIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.BigDecimalIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BigDecimalIndicatorItemProvider bigDecimalIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.BigDecimalIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createBigDecimalIndicatorAdapter() {
        if (bigDecimalIndicatorItemProvider == null) {
            bigDecimalIndicatorItemProvider = new BigDecimalIndicatorItemProvider(this);
        }

        return bigDecimalIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.FrequencyIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FrequencyIndicatorItemProvider frequencyIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.FrequencyIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFrequencyIndicatorAdapter() {
        if (frequencyIndicatorItemProvider == null) {
            frequencyIndicatorItemProvider = new FrequencyIndicatorItemProvider(this);
        }

        return frequencyIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.IntegerMeanIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntegerMeanIndicatorItemProvider integerMeanIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.IntegerMeanIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createIntegerMeanIndicatorAdapter() {
        if (integerMeanIndicatorItemProvider == null) {
            integerMeanIndicatorItemProvider = new IntegerMeanIndicatorItemProvider(this);
        }

        return integerMeanIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.DoubleMeanIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DoubleMeanIndicatorItemProvider doubleMeanIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.DoubleMeanIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDoubleMeanIndicatorAdapter() {
        if (doubleMeanIndicatorItemProvider == null) {
            doubleMeanIndicatorItemProvider = new DoubleMeanIndicatorItemProvider(this);
        }

        return doubleMeanIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.BigDecimalMeanIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BigDecimalMeanIndicatorItemProvider bigDecimalMeanIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.BigDecimalMeanIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createBigDecimalMeanIndicatorAdapter() {
        if (bigDecimalMeanIndicatorItemProvider == null) {
            bigDecimalMeanIndicatorItemProvider = new BigDecimalMeanIndicatorItemProvider(this);
        }

        return bigDecimalMeanIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.BlankCountIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BlankCountIndicatorItemProvider blankCountIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.BlankCountIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createBlankCountIndicatorAdapter() {
        if (blankCountIndicatorItemProvider == null) {
            blankCountIndicatorItemProvider = new BlankCountIndicatorItemProvider(this);
        }

        return blankCountIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.IndicatorParameters} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IndicatorParametersItemProvider indicatorParametersItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.IndicatorParameters}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createIndicatorParametersAdapter() {
        if (indicatorParametersItemProvider == null) {
            indicatorParametersItemProvider = new IndicatorParametersItemProvider(this);
        }

        return indicatorParametersItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.MedianIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MedianIndicatorItemProvider medianIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.MedianIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMedianIndicatorAdapter() {
        if (medianIndicatorItemProvider == null) {
            medianIndicatorItemProvider = new MedianIndicatorItemProvider(this);
        }

        return medianIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.ValueIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValueIndicatorItemProvider valueIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.ValueIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createValueIndicatorAdapter() {
        if (valueIndicatorItemProvider == null) {
            valueIndicatorItemProvider = new ValueIndicatorItemProvider(this);
        }

        return valueIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.MinValueIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MinValueIndicatorItemProvider minValueIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.MinValueIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMinValueIndicatorAdapter() {
        if (minValueIndicatorItemProvider == null) {
            minValueIndicatorItemProvider = new MinValueIndicatorItemProvider(this);
        }

        return minValueIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.MaxValueIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MaxValueIndicatorItemProvider maxValueIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.MaxValueIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMaxValueIndicatorAdapter() {
        if (maxValueIndicatorItemProvider == null) {
            maxValueIndicatorItemProvider = new MaxValueIndicatorItemProvider(this);
        }

        return maxValueIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.ModeIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModeIndicatorItemProvider modeIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.ModeIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createModeIndicatorAdapter() {
        if (modeIndicatorItemProvider == null) {
            modeIndicatorItemProvider = new ModeIndicatorItemProvider(this);
        }

        return modeIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.NullCountIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NullCountIndicatorItemProvider nullCountIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.NullCountIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createNullCountIndicatorAdapter() {
        if (nullCountIndicatorItemProvider == null) {
            nullCountIndicatorItemProvider = new NullCountIndicatorItemProvider(this);
        }

        return nullCountIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.DistinctCountIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DistinctCountIndicatorItemProvider distinctCountIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.DistinctCountIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDistinctCountIndicatorAdapter() {
        if (distinctCountIndicatorItemProvider == null) {
            distinctCountIndicatorItemProvider = new DistinctCountIndicatorItemProvider(this);
        }

        return distinctCountIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.UniqueCountIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UniqueCountIndicatorItemProvider uniqueCountIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.UniqueCountIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createUniqueCountIndicatorAdapter() {
        if (uniqueCountIndicatorItemProvider == null) {
            uniqueCountIndicatorItemProvider = new UniqueCountIndicatorItemProvider(this);
        }

        return uniqueCountIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.DuplicateCountIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DuplicateCountIndicatorItemProvider duplicateCountIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.DuplicateCountIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDuplicateCountIndicatorAdapter() {
        if (duplicateCountIndicatorItemProvider == null) {
            duplicateCountIndicatorItemProvider = new DuplicateCountIndicatorItemProvider(this);
        }

        return duplicateCountIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.IQRIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IQRIndicatorItemProvider iqrIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.IQRIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createIQRIndicatorAdapter() {
        if (iqrIndicatorItemProvider == null) {
            iqrIndicatorItemProvider = new IQRIndicatorItemProvider(this);
        }

        return iqrIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.TextIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TextIndicatorItemProvider textIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.TextIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTextIndicatorAdapter() {
        if (textIndicatorItemProvider == null) {
            textIndicatorItemProvider = new TextIndicatorItemProvider(this);
        }

        return textIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.MinLengthIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MinLengthIndicatorItemProvider minLengthIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.MinLengthIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMinLengthIndicatorAdapter() {
        if (minLengthIndicatorItemProvider == null) {
            minLengthIndicatorItemProvider = new MinLengthIndicatorItemProvider(this);
        }

        return minLengthIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.MaxLengthIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MaxLengthIndicatorItemProvider maxLengthIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.MaxLengthIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMaxLengthIndicatorAdapter() {
        if (maxLengthIndicatorItemProvider == null) {
            maxLengthIndicatorItemProvider = new MaxLengthIndicatorItemProvider(this);
        }

        return maxLengthIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.AverageLengthIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AverageLengthIndicatorItemProvider averageLengthIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.AverageLengthIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAverageLengthIndicatorAdapter() {
        if (averageLengthIndicatorItemProvider == null) {
            averageLengthIndicatorItemProvider = new AverageLengthIndicatorItemProvider(this);
        }

        return averageLengthIndicatorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.talend.dataquality.indicators.LengthIndicator} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LengthIndicatorItemProvider lengthIndicatorItemProvider;

    /**
     * This creates an adapter for a {@link org.talend.dataquality.indicators.LengthIndicator}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createLengthIndicatorAdapter() {
        if (lengthIndicatorItemProvider == null) {
            lengthIndicatorItemProvider = new LengthIndicatorItemProvider(this);
        }

        return lengthIndicatorItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (indicatorItemProvider != null) indicatorItemProvider.dispose();
        if (rowCountIndicatorItemProvider != null) rowCountIndicatorItemProvider.dispose();
        if (sumIndicatorItemProvider != null) sumIndicatorItemProvider.dispose();
        if (compositeIndicatorItemProvider != null) compositeIndicatorItemProvider.dispose();
        if (rangeIndicatorItemProvider != null) rangeIndicatorItemProvider.dispose();
        if (boxIndicatorItemProvider != null) boxIndicatorItemProvider.dispose();
        if (indicatorTypeItemProvider != null) indicatorTypeItemProvider.dispose();
        if (integerSumIndicatorItemProvider != null) integerSumIndicatorItemProvider.dispose();
        if (doubleSumIndicatorItemProvider != null) doubleSumIndicatorItemProvider.dispose();
        if (bigDecimalIndicatorItemProvider != null) bigDecimalIndicatorItemProvider.dispose();
        if (frequencyIndicatorItemProvider != null) frequencyIndicatorItemProvider.dispose();
        if (integerMeanIndicatorItemProvider != null) integerMeanIndicatorItemProvider.dispose();
        if (doubleMeanIndicatorItemProvider != null) doubleMeanIndicatorItemProvider.dispose();
        if (bigDecimalMeanIndicatorItemProvider != null) bigDecimalMeanIndicatorItemProvider.dispose();
        if (blankCountIndicatorItemProvider != null) blankCountIndicatorItemProvider.dispose();
        if (indicatorParametersItemProvider != null) indicatorParametersItemProvider.dispose();
        if (medianIndicatorItemProvider != null) medianIndicatorItemProvider.dispose();
        if (valueIndicatorItemProvider != null) valueIndicatorItemProvider.dispose();
        if (minValueIndicatorItemProvider != null) minValueIndicatorItemProvider.dispose();
        if (maxValueIndicatorItemProvider != null) maxValueIndicatorItemProvider.dispose();
        if (modeIndicatorItemProvider != null) modeIndicatorItemProvider.dispose();
        if (nullCountIndicatorItemProvider != null) nullCountIndicatorItemProvider.dispose();
        if (distinctCountIndicatorItemProvider != null) distinctCountIndicatorItemProvider.dispose();
        if (uniqueCountIndicatorItemProvider != null) uniqueCountIndicatorItemProvider.dispose();
        if (duplicateCountIndicatorItemProvider != null) duplicateCountIndicatorItemProvider.dispose();
        if (iqrIndicatorItemProvider != null) iqrIndicatorItemProvider.dispose();
        if (textIndicatorItemProvider != null) textIndicatorItemProvider.dispose();
        if (minLengthIndicatorItemProvider != null) minLengthIndicatorItemProvider.dispose();
        if (maxLengthIndicatorItemProvider != null) maxLengthIndicatorItemProvider.dispose();
        if (averageLengthIndicatorItemProvider != null) averageLengthIndicatorItemProvider.dispose();
        if (lengthIndicatorItemProvider != null) lengthIndicatorItemProvider.dispose();
    }

}
